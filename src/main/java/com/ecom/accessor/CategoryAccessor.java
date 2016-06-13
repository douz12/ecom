package com.ecom.accessor;

import com.datastax.driver.mapping.Result;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Param;
import com.datastax.driver.mapping.annotations.Query;
import com.ecom.model.Category;

@Accessor
public interface CategoryAccessor {

    @Query(value = "SELECT * FROM category WHERE categoryid = :id AND categoryvalue = :value ALLOW FILTERING;")
    Result<Category> getCategoryById(@Param("id") String categoryId, @Param("value") String value);
}
