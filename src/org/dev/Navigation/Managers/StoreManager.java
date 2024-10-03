package org.dev.Navigation.Managers;

import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;
import org.dev.Navigation.Pickers.ProductPicker;
import org.dev.Navigation.UsefulClasses.ProductConstructor;
import org.dev.StoreFunctionalityClasses.Product;
import org.dev.StoreFunctionalityClasses.Store;

import java.util.List;

public class StoreManager {

    public static void manageStore(Store store){
        Menu<Void> menu = StoreManagementMENU.getMenu(store);
        MenuController<Void> menuController = new MenuController(menu);
        menuController.getAnswer();
    }
}

class StoreManagementMENU{
    public static Menu<Void> getMenu(Store store) {

        String title = "Store Management Menu";

        Menu<Void> menu = new Menu<>(title);
        menu.addMenuOption("Manage product", () -> {
            List<Product> products = store.getProducts();
            store.manageItem(ProductPicker.getProduct(products));

            return null;
        });
        menu.addMenuOption("Add product", () -> {
            Product product = ProductConstructor.getProduct();
            store.add(product);
            return null;
        });
        menu.addMenuOption("Delete product", () -> {
            List<Product> products = store.getProducts();
            store.remove(ProductPicker.getProduct(products));

            return null;
        });

        return menu;
    }
}
