package com.ecom.controller.pages.front;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import com.ecom.repository.CategorySearchRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryPageController extends ExceptionHandlerExceptionResolver {

    @Autowired
    CategorySearchRepository categorySearchRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/Category/{categoryId}/{categoryName}")
    public String showCategory(@PathVariable String categoryId, @PathVariable String categoryName, ModelMap modelMap) {
        Category category = new Category();
        category.setCategoryValue("Informatiques");
        category.setCategoryId("Info-1000");
        Category subCategory = new Category();
        subCategory.setCategoryId("Info-1100");
        subCategory.setCategoryValue("Imprimante");
        List<Category> categories = Lists.newArrayList();
        categories.add(subCategory);
        category.setSubCategories(categories);
        mongoTemplate.save(category);

        Optional<Category> categoryOptional = categorySearchRepository.findCategoryByIdAndName(categoryId, categoryName);
        if (categoryOptional.isPresent()) {
            modelMap.addAttribute("category", categoryOptional.get());
            return "category";
        }
        return null;
    }
}
