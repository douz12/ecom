package com.ecom.model;

import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Category")
public class Category {
    @Id private String categoryId;
    private String categoryValue;
    @DBRef(db = "Category")
    private List<SubCategory> subCategories = Lists.newArrayList();
    @DBRef(db = "Offer")
    private List<Offer> offers = Lists.newArrayList();

    public void addSubCategory(SubCategory category) {
        subCategories.add(category);
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
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

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
