package org.dev.Interfaces.OtherInterfaces;

import org.dev.Interfaces.MenuInterfaces.categoryMENU;
import org.dev.Menu.ConsoleMenuInput;
import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;
import org.dev.Rest.Category;
import org.dev.Rest.Product;

import java.util.Scanner;

public class ProductConstructionInterface {
    private static Scanner sc = new Scanner(System.in);
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();
    private static final Menu<Category> categoryMenu = categoryMENU.constructMenu();
    private static final MenuController<Category> controller = new MenuController<>(categoryMenu, consoleMenuInput);

    public static Product getProduct(){
        System.out.print("Enter product name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter product short name: ");
        String shortName = sc.nextLine();
        System.out.print("Enter product manufacturer: ");
        String manufacturer = sc.nextLine();
        Category category = controller.getAnswer();

        return new Product(shortName, fullName, manufacturer, category);

    }
}
