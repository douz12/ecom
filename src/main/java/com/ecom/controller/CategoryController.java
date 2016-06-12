package com.ecom.controller;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ProtocolVersion;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.ecom.model.Address;
import com.ecom.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private MappingManager mappingManager;

    @RequestMapping("/category/{categoryId}/{categoryValue}")
    public Category getCategory(@PathVariable String categoryId, @PathVariable String categoryValue) {
        Mapper<Address> addressMapper = mappingManager.mapper(Address.class);
        Address address = new Address();
        address.setAddressId("B55");
        address.setCountry("Antananarivo");
        addressMapper.save(address);
        return new Category();
    }
}

