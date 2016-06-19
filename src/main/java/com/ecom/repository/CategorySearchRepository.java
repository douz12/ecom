package com.ecom.repository;

import com.ecom.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class CategorySearchRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    public Optional<Category> findCategoryByIdAndName(String id, String name) {
        return mongoTemplate
                .find(Query.query(new Criteria()
                                .andOperator(
                                        Criteria.where("_id").is(id),
                                        Criteria.where("categoryValue").is(name)))
                        , Category.class)
                .stream()
                .findFirst();
    }
}
