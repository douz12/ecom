package com.ecom.dao.repository;

import com.ecom.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {
}
