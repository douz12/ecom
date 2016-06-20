package com.ecom.model;

import com.google.common.collect.Sets;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "Vendor")
public class Vendor {
    private String vendorId;
    private String vendorName;
    private Set addresses = Sets.newHashSet();

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}
