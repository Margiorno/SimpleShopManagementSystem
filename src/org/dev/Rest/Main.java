package org.dev.Rest;

import org.dev.Menu.ConsoleMenuInput;
import org.dev.Menu.Menu;

public class Main {
    private static final ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();

    public static void main(String[] args) {
        ConsoleMenuInput consoleMenuInput = new ConsoleMenuInput();
        Menu<Void> menuTestowe = new Menu<>("Testowe", consoleMenuInput);
        menuTestowe.addMenuOption("Say dupa", ()->{
            System.out.println("dupa");
            return null;
        });
        menuTestowe.menuInterface();



    }
}
