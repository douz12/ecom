package com.ecom.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SubCategory")
public class SubCategory extends Category {
}
