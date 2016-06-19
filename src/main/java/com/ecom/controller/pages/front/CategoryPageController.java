package com.ecom.controller.pages.front;

import com.ecom.common.utils.QueryResponse;
import com.ecom.model.Category;
import com.ecom.repository.CategorySearchRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class CategoryPageController extends ExceptionHandlerExceptionResolver {

    @Autowired
    CategorySearchRepository categorySearchRepository;

    @RequestMapping("/Category/{categoryId}/{categoryName}")
    public String showCategory(@PathVariable String categoryId, @PathVariable String categoryName, ModelMap modelMap) {
        Optional<Category> categoryOptional = categorySearchRepository.findCategoryByIdAndName(categoryId, categoryName);
        if (categoryOptional.isPresent()) {
            modelMap.addAttribute("category", categoryOptional.get());
            return "category";
        }
        return null;
    }
}
