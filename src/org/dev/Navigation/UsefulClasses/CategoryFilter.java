package org.dev.Navigation.UsefulClasses;

import org.dev.Rest.Category;
import org.dev.Rest.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter {

    private static List<Product> getFiltredSubList(List<Product> products, Category category) {
        if (category.equals(Category.NO_CATEGORY))
            return products;

        List<Product> filteredProducts = new ArrayList<Product>();
        products.forEach(product -> {if (product.getCategory().equals(category)) {filteredProducts.add(product);}});
        return filteredProducts;
    }
}
