package com.ecom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.ektorp.docref.DocumentReferences;
import org.ektorp.docref.FetchType;
import org.ektorp.support.CouchDbDocument;

import java.util.List;
import java.util.Set;

public class Offer extends CouchDbDocument{
    @JsonProperty("_id")
    private String offerId;
    @DocumentReferences(fetch = FetchType.LAZY, descendingSortOrder = true, orderBy = "dateCreated", backReference = "categoryId")
    private Set<Category> categories;
    @DocumentReferences(fetch = FetchType.LAZY, descendingSortOrder = true, orderBy = "dateCreated", backReference = "productId")
    private List<Product> products;
    @DocumentReferences(fetch = FetchType.LAZY, descendingSortOrder = true, orderBy = "dateCreated", backReference = "_id")
    private Vendor vendor;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
