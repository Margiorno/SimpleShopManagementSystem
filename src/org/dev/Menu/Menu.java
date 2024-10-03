package org.dev.Menu;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu<T> {
    private final LinkedList<MenuOption<T>> menuOptions_operations;
    private final MenuDisplay<T> menuDisplay;

    public Menu(String title) {
        this.menuOptions_operations = new LinkedList<>();
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

    public MenuDisplay<T> getMenuDisplay() {
        return menuDisplay;
    }

    public LinkedList<MenuOption<T>> getMenuOptions() {
        return menuOptions_operations;
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
