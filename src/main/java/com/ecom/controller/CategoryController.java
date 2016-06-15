package com.ecom.controller;

import com.ecom.common.CouchDbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CouchDbConfig couchDbConfig;

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public void getCategory(@PathVariable String categoryId) {

    }
}

