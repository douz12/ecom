package com.ecom.accessor;

import com.datastax.driver.mapping.Result;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Param;
import com.datastax.driver.mapping.annotations.Query;
import com.ecom.model.Category;

@Accessor
public interface CategoryAccessor {

    @Query(value = "SELECT * FROM user WHERE categoryid = :id")
    Result<Category> getCategoryById(@Param("id") String categoryId);
}
