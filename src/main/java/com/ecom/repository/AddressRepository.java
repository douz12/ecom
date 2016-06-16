package com.ecom.repository;

import com.ecom.common.CouchDbConfig;
import com.ecom.model.Address;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressRepository extends CouchDbRepositorySupport<Address> {

    @Autowired
    private static CouchDbConfig couchDbConfig;

    protected AddressRepository(CouchDbConnector db) {
        super(Address.class, db);
    }

    public static AddressRepository connectToCouchDb() {
        return new AddressRepository(couchDbConfig.getCouchDbConnector());
    }

    @GenerateView
    public List<Address> findByCountry(String country) {
        return queryView("by_country", country);
    }

    @GenerateView
    public List<Address> findByState(String state) {
        return queryView("by_state", state);
    }

    @GenerateView
    public List<Address> findByPostalCode(String postalCode) {
        return queryView("by_postalCode", postalCode);
    }

    @GenerateView
    public List<Address> findByResidentialAddress(String residentialAddress) {
        return queryView("by_residentialAddress", residentialAddress);
    }
}
