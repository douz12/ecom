package com.ecom.model;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.List;

@Table(keyspace = "ecom", name = "offer")
public class Offer {
    @PartitionKey
    @Column(name = "offerid")
    private String offerId;
    private Product product;
    private List<Image> images;
    @Column(name = "availabilitytext")
    private String availabilityText;
    @Column(name = "deliverytext")
    private String deliveryText;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getAvailabilityText() {
        return availabilityText;
    }

    public void setAvailabilityText(String availabilityText) {
        this.availabilityText = availabilityText;
    }

    public String getDeliveryText() {
        return deliveryText;
    }

    public void setDeliveryText(String deliveryText) {
        this.deliveryText = deliveryText;
    }
}
