package com.ecom.controller.pages.front;

import com.ecom.model.Category;
import com.ecom.dao.repository.CategoryRepository;
import com.ecom.dao.template.CategorySearchTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import java.util.Optional;

@Controller
public class CategoryPageController extends ExceptionHandlerExceptionResolver {

    @Autowired
    CategorySearchTemplate categorySearchTemplate;

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/category/{categoryId}/{categoryName}")
    public String showCategory(@PathVariable String categoryId, @PathVariable String categoryName, ModelMap modelMap) {
        Optional<Category> categoryOptional = categorySearchTemplate.findCategoryByIdAndName(categoryId, categoryName);
        if (categoryOptional.isPresent()) {
            modelMap.addAttribute("category", categoryOptional.get());
            return "category";
        }
        return null;
    }
}
