package org.dev.Interfaces.MenuInterfaces;

import org.dev.Menu.Menu;
import org.dev.Rest.Category;
import org.dev.Rest.Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class shopManagementMENU {
    private Store store;

    public shopManagementMENU(Store store) {
        this.store = store;
    }

    public static Menu<Category> constructMenu(){
        Menu<Category> menu = new Menu<>("Choose product category");
        List<Category> categories = new ArrayList<Category>(Arrays.asList(Category.values()));
        categories.forEach(category -> {
            menu.addMenuOption(category.toString(), ()->{return category;});
        });

        return menu;
    }
}
