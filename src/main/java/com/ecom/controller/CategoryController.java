package com.ecom.controller;

import com.ecom.accessor.CategoryAccessor;
import com.ecom.common.config.CassandraConfig;
import com.ecom.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    private CassandraConfig cassandraConfig;

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public ResponseEntity<Category> getCategory(@PathVariable String categoryId) {
        Category category = cassandraConfig
                .getMappingManager()
                .createAccessor(CategoryAccessor.class)
                .getCategoryById(categoryId)
                .one();
        if (category == null) {
            System.err.println("Category id [" + categoryId + "] not found.");
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/add", method = RequestMethod.POST)
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        cassandraConfig.getMappingManager().mapper(Category.class).save(category);
        return  new ResponseEntity<Category>(category, HttpStatus.OK);
    }
}

