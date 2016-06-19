package com.ecom.controller.services;

import com.ecom.common.utils.QueryResponse;
import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/category/add", method = RequestMethod.POST)
    public ResponseEntity<Category> addCategory(@ModelAttribute("Category") Category category) {
        categoryRepository.save(category);
        return QueryResponse.<Category>toResponseEntity().apply(Optional.<Category>of(category));
    }
}

