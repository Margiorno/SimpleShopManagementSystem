package org.dev;

public class InventoryItem {

    private final Product product;
    private int quantityTotal;
    private int quantityReserved;
    private double itemPrice;

    private final int quantityReorder;
    private final int quantityLow;

    public InventoryItem(Product product, double itemPrice, int quantityReorder, int quantityLow) {
        this.product = product;
        this.quantityReorder = quantityReorder;
        this.quantityLow = quantityLow;
        this.itemPrice = itemPrice;
        this.quantityTotal = quantityReorder + quantityLow;
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

    private void placeInventoryOrder(int quantity) {
        this.quantityTotal+=quantity;
    }

    public double getItemPrice() {
        return itemPrice;
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
