package com.ecom.model;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.Set;

@Table(keyspace = "ecom", name = "vendor")
public class Vendor {
    @PartitionKey
    @Column(name = "vendorid")
    private String vendorId;
    private String name;
    private Set<String> addressIds;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getAddressIds() {
        return addressIds;
    }

    public void setAddressIds(Set<String> addressIds) {
        this.addressIds = addressIds;
    }
}
