package org.dev;

import java.util.HashMap;
import java.util.HashSet;

public class Store {
    private HashMap<Category,InventoryItem> inventory;
    private HashSet<Cart> carts;

    public Store() {
        carts = new HashSet<>();
    }

    public void manageInventory() {

    }

}