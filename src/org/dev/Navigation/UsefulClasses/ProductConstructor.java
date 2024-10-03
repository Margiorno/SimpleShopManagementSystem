package org.dev.Navigation.UsefulClasses;

import org.dev.Menu.ConsoleMenuInput;
import org.dev.Navigation.Pickers.CategoryPicker;
import org.dev.StoreFunctionalityClasses.Category;
import org.dev.StoreFunctionalityClasses.Product;

import java.util.Scanner;

public class ProductConstructor {
    private static Scanner sc = new Scanner(System.in);

    public static Product getProduct(){
        System.out.print("Enter product name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter product short name: ");
        String shortName = sc.nextLine();
        System.out.print("Enter product manufacturer: ");
        String manufacturer = sc.nextLine();
        Category category = CategoryPicker.getCategory();

        return new Product(fullName, shortName, manufacturer, category);
    }
}
