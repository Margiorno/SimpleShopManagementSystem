package org.dev.Navigation.UsefulClasses;

import org.dev.Menu.MenuController;
import org.dev.Navigation.MenuGenerator.ObjectChoiceMENU;
import org.dev.StoreFunctionalityClasses.Category;
import org.dev.StoreFunctionalityClasses.Product;

import java.util.Arrays;
import java.util.List;

public class ProductPicker {

    public static Product getProduct(List<Product> products) {
        Category category = CategoryPicker.getCategory();
        List<Product> sublist = CategoryFilter.getFiltredSubList(products, category);
        MenuController<Product> productsMENU = new MenuController<>(ObjectChoiceMENU.getMenu("Choice product: ", sublist));

        return productsMENU.getAnswer();
    }
}
