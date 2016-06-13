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
    @Column(name = "offers")
    private List<Offer> offers;
    private SubCategory subCategory;

    public Category() {
    }

    public Category(String categoryId, String categoryValue) {
        this.categoryId = categoryId;
        this.categoryValue = categoryValue;
    }

    public Category(String categoryId, String categoryValue, List<Offer> offers) {
        this.categoryId = categoryId;
        this.categoryValue = categoryValue;
        this.offers = offers;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
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
