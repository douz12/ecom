package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public void getCategory(@PathVariable String categoryId) {

    }
}

