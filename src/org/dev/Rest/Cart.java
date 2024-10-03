package org.dev.Rest;

import java.time.LocalDate;
import java.util.HashMap;

public class Cart {
    private static int ID = 1;

    private int id;
    private HashMap<Product, Integer> products;
    private LocalDate date;

    public Cart() {
        this.products = new HashMap<>();
        this.date = LocalDate.now();
        this.id = ID++;
    }


    public void addProduct(Product product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    public void removeProduct(Product product, int quantity) {}

    public void removeProduct(Product product) {
        removeProduct(product, 1);
    }

    public void printSalesSlip(){

    }



}
