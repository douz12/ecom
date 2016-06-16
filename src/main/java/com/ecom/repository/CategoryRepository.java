package com.ecom.repository;

import com.ecom.common.CouchDbConfig;
import com.ecom.model.Category;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryRepository extends CouchDbRepositorySupport<Category> {

    public CategoryRepository(CouchDbConnector db) {
        super(Category.class, db);
    }

    @GenerateView
    public List<Category> findByCategoryId(String categoryId) {
        return queryView("by_categoryId", categoryId);
    }

    @GenerateView
    public List<Category> findByCategoryValue(String value) {
        return queryView("by_categoryValue", value);
    }
}
