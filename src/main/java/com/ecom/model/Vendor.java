package com.ecom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.ektorp.docref.DocumentReferences;
import org.ektorp.docref.FetchType;

import java.util.Set;

public class Vendor {
    @JsonProperty("_id")
    private String vendorId;
    private String vendorName;
    @DocumentReferences(fetch = FetchType.LAZY, descendingSortOrder = true, orderBy = "dateCreated", backReference = "vendorId")
    private Set<Address> addresses;

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
