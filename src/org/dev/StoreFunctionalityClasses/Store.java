package org.dev.StoreFunctionalityClasses;

import org.dev.Navigation.UsefulClasses.ItemManager;
import org.dev.Rest.InventoryItem;

import java.util.HashMap;
import java.util.List;

public class Store {
    private HashMap<Product, InventoryItem> inventory;


    public Store() {
        inventory = new HashMap<>();
    }

    public void importProducts(List<Product> products) {
        products.forEach(this::add);
    }

    public void add(Product product) {
        inventory.put(product, new InventoryItem(product,0));
    }

    public void manageItem(Product product) {
        InventoryItem item = inventory.get(product);
        ItemManager.manageItem(item);
    }


}