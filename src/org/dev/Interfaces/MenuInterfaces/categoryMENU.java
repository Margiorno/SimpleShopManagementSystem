package org.dev.Interfaces.MenuInterfaces;

import org.dev.Menu.Menu;
import org.dev.Rest.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class categoryMENU {

    public static Menu<Category> constructMenu(){
        Menu<Category> menu = new Menu<>("Choose product category");
        List<Category> categories = new ArrayList<Category>(Arrays.asList(Category.values()));
        categories.forEach(category -> {
            menu.addMenuOption(category.toString(), ()->{return category;});
        });

        return menu;
    }
}