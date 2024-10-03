package org.dev.Interfaces.OtherInterfaces;

import org.dev.Rest.InventoryItem;
import org.dev.Rest.Product;

import java.util.Scanner;

public class InventoryItemConstructionInterface {
    private static Scanner sc = new Scanner(System.in);

    public static InventoryItem getInventoryItem() {
        Product product = ProductConstructionInterface.getProduct();
        System.out.print("Enter product prize: ");
        double itemPrice = sc.nextDouble();
        return new InventoryItem(product, itemPrice);
    }
}
