package org.dev.StoreFunctionalityClasses;

import org.dev.Navigation.Managers.ItemManager;
import org.dev.Rest.InventoryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {
    private HashMap<Product, InventoryItem> inventory;


    public Store() {
        inventory = new HashMap<>();
    }

    public void importItems(List<InventoryItem> items) {
        items.forEach(this::add);
    }

    public void importProducts(List<InventoryItem> products) {
        products.forEach(this::add);
    }

    public void add(Product product) {
        inventory.put(product, new InventoryItem(product,0));
    }

    public void add(InventoryItem item) {
        inventory.put(item.getProduct(), item);
    }

    public void remove(Product product) {
        inventory.remove(product);
    }

    public void manageItem(Product product) {
        InventoryItem item = inventory.get(product);
        ItemManager.manageItem(item);
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        inventory.forEach((product, inventoryItem) -> {products.add(product); });
        return products;
    }


}