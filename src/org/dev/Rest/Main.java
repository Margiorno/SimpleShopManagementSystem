package org.dev.Rest;

import org.dev.Menu.ConsoleMenuInput;
import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;

public class Main {
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();

    public static void main(String[] args) {
        Menu<Void> menuTestowe = new Menu<>("Testowe");
        menuTestowe.addMenuOption("Say dupa", ()->{
            System.out.println("dupa");
            return null;
        });


        MenuController<Void> controller = new MenuController<>(menuTestowe, consoleMenuInput);
        controller.menuInterface();



    }
}
