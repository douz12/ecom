package com.ecom.dao.repository;

import com.ecom.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
}
