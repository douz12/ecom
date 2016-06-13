package com.ecom.model;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Table(keyspace = "ecom", name = "offer")
public class Offer {
    @PartitionKey
    @Column(name = "offerid")
    private String offerId;
    @Column(name = "productids")
    private List<String> productIds;
    @Column(name = "imageids")
    private List<String> imageIds;
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

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public List<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
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
