package com.ecom.controller;

import com.ecom.model.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public Category getCategory(@PathVariable String categoryId, @PathVariable String categoryValue) {
        return new Category();
    }
}

