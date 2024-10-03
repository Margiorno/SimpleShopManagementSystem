package org.dev.Navigation.UsefulClasses;

import org.dev.StoreFunctionalityClasses.Category;
import org.dev.StoreFunctionalityClasses.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter {

    public static List<Product> getFiltredSubList(List<Product> products, Category category) {
        if (category.equals(Category.NO_CATEGORY))
            return products;

        List<Product> filteredProducts = new ArrayList<Product>();
        products.forEach(product -> {if (product.category().equals(category)) {filteredProducts.add(product);}});
        return filteredProducts;
    }
}
