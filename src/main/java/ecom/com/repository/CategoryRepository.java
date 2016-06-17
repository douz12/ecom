package ecom.com.repository;

import com.google.common.collect.Lists;
import ecom.com.model.Category;
import ecom.com.model.Offer;

import java.util.List;

public class CategoryRepository {
    public static List<Category> getAllCategories() {
        List<Category> categories = Lists.newArrayList();
        Category category = new Category();
        category.setCategoryId("INFO-1");
        category.setCategoryValue("Imprimante");

        categories.add(category);
        return categories;
    }

    public static List<Offer> getOfferByIdAndName(String categoryId, String categoryName) {
        List<Offer> offers = Lists.newArrayList();
        return offers;
    }
}
