package org.dev.Rest;

import java.util.HashMap;
import java.util.HashSet;

public class Store {
    private HashMap<Category,InventoryItem> inventory;
    private HashSet<ClientCart> carts;

    public Store() {
        carts = new HashSet<>();
    }


}