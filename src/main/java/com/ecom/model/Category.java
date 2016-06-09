package com.ecom.model;

import com.google.common.collect.Lists;

import java.util.List;

public class Category {
    private String categoryId;
    private String categoryValue;
    private List<Category> subCategories;

    public Category(String categoryId, String categoryValue) {
        this.categoryId = categoryId;
        this.subCategories = Lists.newArrayList();
        this.categoryValue = categoryValue;
    }

    public void addSubCategorie(Category subCategory) {
        this.getSubCategories().add(subCategory);
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }
}
