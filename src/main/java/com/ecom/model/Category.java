package com.ecom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import org.ektorp.docref.DocumentReferences;
import org.ektorp.docref.FetchType;
import org.ektorp.support.CouchDbDocument;

import java.util.List;

public class Category extends CouchDbDocument {
    @JsonProperty("_id")
    private String categoryId;
    private String categoryValue;
    @DocumentReferences(fetch = FetchType.LAZY, descendingSortOrder = true, orderBy = "dateCreated", backReference = "categoryId")
    private List<Category> subCategories = Lists.newArrayList();
    private List<Offer> offers = Lists.newArrayList();

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
