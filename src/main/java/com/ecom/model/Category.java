package com.ecom.model;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.List;

@Table(keyspace = "ecom", name = "category")
public class Category {
    @PartitionKey
    @Column(name = "categoryid")
    private String categoryId;
    @Column(name = "categoryvalue")
    private String categoryValue;
    @Column(name = "subcategories")
    private List<Category> subCategories;
    @Column(name = "offers")
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
