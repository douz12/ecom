package com.ecom.controller;

import com.ecom.common.CouchDbConfig;
import com.ecom.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CouchDbConfig couchDbConfig;

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public Address getCategory(@PathVariable String categoryId) {
        Address address = new Address();
        address.setCountry("Antananarivo");
        address.setPostalCode("103");
        address.setResidentialAddress("B55 Sabotsy Namehana");
        couchDbConfig.getCouchDbConnector().create(address);
        return address;
    }
}

