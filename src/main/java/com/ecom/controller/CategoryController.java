package com.ecom.controller;

import com.ecom.common.CouchDbConfig;
import com.ecom.common.utils.QueryResponse;
import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CouchDbConfig couchDbConfig;

    @RequestMapping("/category/{categoryId}")
    public ResponseEntity<Category> getCategory(@PathVariable String categoryId) {
        return QueryResponse
                .<Category>toResponseEntity()
                .apply(CategoryRepository
                        .connectToCouchDb()
                        .findByCategoryId(categoryId)
                        .stream()
                        .filter(cat -> cat != null)
                        .findFirst());
    }
}

