package com.ecom.model;

import com.ecom.common.utils.CascadeSave;
import com.google.common.collect.Lists;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Category")
public class Category {
    @Id private String categoryId;
    private String categoryValue;
    @Field("subCategories")
    @DBRef
    @CascadeSave
    private List<Category> subCategories = Lists.newArrayList();
    @DBRef(db = "Offer")
    private List<Offer> offers = Lists.newArrayList();

    public void addSubCategory(Category category) {
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

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }
}
