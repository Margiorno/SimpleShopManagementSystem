package org.dev.Rest;

import org.dev.Navigation.MenuGenerator.ObjectChoiceMENU;
import org.dev.Menu.ConsoleMenuInput;
import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;
import org.dev.StoreFunctionalityClasses.Category;
import org.dev.StoreFunctionalityClasses.Product;

import java.util.*;

public class Main {
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();

    public static void main(String[] args) {
        Menu<Category> categoryMenu = ObjectChoiceMENU.getMenu("CATEGORIES",Arrays.asList(Category.values()));
        MenuController<Category> categoryMenuController = new MenuController<>(categoryMenu, consoleMenuInput);


        List<Product> products = new ArrayList<>();
        List<InventoryItem> items = new ArrayList<>();
        Random rand = new Random();

        products.add(new Product("ACM_AW_TS","Ac Milan Away t-shirt","Puma",Category.T_SHIRT));
        products.add(new Product("RMCF_BLA_BL","Real Madrid black blouse","Adidas",Category.JACKET));
        products.add(new Product("ACM_HO_TS","Ac Milan Home t-shirt","Puma",Category.T_SHIRT));
        products.add(new Product("CHE_AW_TS","Chelsea Away t-shirt","Adidas",Category.T_SHIRT));
        products.add(new Product("WIS_BLA_PA","Wisla Black pants","Adidas",Category.PANTS));
        products.add(new Product("ACM_WHI_PA","Ac Milan White pants","Puma",Category.PANTS));

        products.forEach((product -> items.add(new InventoryItem(product, rand.nextDouble(100,200)))));




    }
}
