package org.dev.Rest;

import org.dev.Menu.MenuOption;
import org.dev.StoreFunctionalityClasses.Product;

public class InventoryItem {

    private final Product product;
    private int quantityTotal;
    private int quantityReserved;
    private double itemPrice;

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public InventoryItem(Product product, double itemPrice) {
        this.product = product;
        this.itemPrice = itemPrice;
        this.quantityTotal = 0;
        this.quantityReserved = 0;
    }

    private boolean reserve(int quantity) {
        if (quantity > quantityTotal-quantityReserved) {
            return false;
        }
        quantityReserved += quantity;
        return true;
    }

    private boolean release(int quantity) {
        if (quantity > quantityTotal-quantityReserved) {
            return false;
        }
        quantityTotal -= quantity;
        return true;
    }

    private boolean sell(int quantity) {
        if (quantity > quantityReserved) {
            return false;
        }
        quantityReserved -= quantity;
        quantityTotal -= quantity;
        return true;
    }

    public void placeInventoryOrder(int quantity) {
        this.quantityTotal+=quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantityTotal() {
        return quantityTotal;
    }

    public int getQuantityReserved() {
        return quantityReserved;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return this.product.hashCode();
    }
}
