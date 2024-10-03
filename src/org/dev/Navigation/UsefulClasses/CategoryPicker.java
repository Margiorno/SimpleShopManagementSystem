package org.dev.Navigation.UsefulClasses;

import org.dev.Menu.MenuController;
import org.dev.Navigation.MenuGenerator.ObjectChoiceMENU;
import org.dev.StoreFunctionalityClasses.Category;

import java.util.Arrays;

public class CategoryPicker {
    public static Category getCategory() {
        MenuController<Category> categoryMENU =
                new MenuController<>(ObjectChoiceMENU.getMenu("Choice category of object: ", Arrays.asList(Category.values())));
        return categoryMENU.getAnswer();
    }
}
