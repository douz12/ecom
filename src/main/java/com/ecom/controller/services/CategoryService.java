package com.ecom.controller.services;

import com.ecom.common.utils.QueryResponse;
import com.ecom.model.Category;
import com.ecom.dao.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/category/", method = RequestMethod.POST)
    public ResponseEntity<Category> addCategory(@ModelAttribute("Category") Category category) {
        categoryRepository.save(category);
        return QueryResponse.<Category>toResponseEntity().apply(Optional.of(category));
    }
}

