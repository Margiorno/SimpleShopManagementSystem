package org.dev.Menu;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu<T> {
    private LinkedList<MenuOption<T>> menuOptions_operations;
    private MenuInput menuInput;
    private MenuDisplay<T> menuDisplay;

    public Menu(String title, MenuInput menuInput) {
        this.menuOptions_operations = new LinkedList<>();
        this.menuInput = menuInput;
        this.menuDisplay = new MenuDisplay<T>(title);
    }

    public T executeOption(int optionNumber)
    {
        return menuOptions_operations.get(optionNumber).execute();
    }

    public void addMenuOption(String description ,MenuOption<T> operation){
        menuOptions_operations.add(operation);
        menuDisplay.addMenuOption(description);
    }

    public T menuInterface(){
        menuDisplay.displayOptions();
        int option = menuInput.getUserInput();

        while (option < 0 || option >= menuOptions_operations.size()){
            System.out.print("Invalid choice! Pick your option: ");
            option = menuInput.getUserInput();
        }

        return menuOptions_operations.get(option).execute();
    }
}

class MenuDisplay<T>{
    private String title;
    private LinkedList<String> menuOptions_descriptions;

    public MenuDisplay(String title){
        this.title = title;
        menuOptions_descriptions = new LinkedList<>();
    }

    public void addMenuOption(String description){
        menuOptions_descriptions.add(description);
    }

    public void displayOptions()
    {
        AtomicInteger counter = new AtomicInteger();

        System.out.println(this.title);
        menuOptions_descriptions.forEach((option) -> {
            System.out.printf("[%d] %s%n", counter.getAndIncrement(),option);
        });
    }
}
