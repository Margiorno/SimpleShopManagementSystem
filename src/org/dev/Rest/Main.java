package org.dev.Rest;

import org.dev.Interfaces.OtherInterfaces.ProductConstructionInterface;
import org.dev.Menu.ConsoleMenuInput;
import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;
import org.dev.Interfaces.MenuInterfaces.categoryMENU;

public class Main {
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();

    public static void main(String[] args) {
//        Menu<Category> categoryMenu = categoryMENU.constructMenu();
//        MenuController<Category> controller = new MenuController<>(categoryMenu, consoleMenuInput);
//
//
//        Category value = controller.getAnswer();
//        System.out.printf("Value of choice: %s%nClass: %s%n",value.toString(),value.getClass().getSimpleName());

        Product product = ProductConstructionInterface.getProduct();
        System.out.println(product);



    }
}
