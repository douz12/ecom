package com.ecom.model;

import java.util.List;

public class Category {
    private String categoryId;
    private String categoryValue;
    private List<Category> subCategories;
    private List<Offer> offers;

    public Category() {
    }

    public Category(String categoryId, String categoryValue) {
        this.categoryId = categoryId;
        this.categoryValue = categoryValue;
    }

    public Category(String categoryId, String categoryValue, List<Category> subCategories, List<Offer> offers) {
        this.categoryId = categoryId;
        this.categoryValue = categoryValue;
        this.subCategories = subCategories;
        this.offers = offers;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
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
