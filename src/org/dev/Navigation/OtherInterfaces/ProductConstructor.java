package org.dev.Navigation.OtherInterfaces;

import org.dev.Menu.ConsoleMenuInput;
import org.dev.StoreFunctionalityClasses.Product;

import java.util.Scanner;

public class ProductConstructor {
    private static Scanner sc = new Scanner(System.in);
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();

    public static Product getProduct(){
        System.out.print("Enter product name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter product short name: ");
        String shortName = sc.nextLine();
        System.out.print("Enter product manufacturer: ");
        String manufacturer = sc.nextLine();

        return null;
    }
}
