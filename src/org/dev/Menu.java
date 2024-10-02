package org.dev;

import org.w3c.dom.ranges.RangeException;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

interface MenuOption{
    void execute();
}

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    private String title;
    private LinkedList<MenuOption> menuOptions_operations;
    private LinkedList<String> menuOptions_descriptions;

    public Menu(String title) {
        this.title = title;
        this.menuOptions_descriptions = new LinkedList<>();
        this.menuOptions_operations = new LinkedList<>();
    }

    public void executeOption(int optionNumber)
    {
        menuOptions_operations.get(optionNumber).execute();
    }

    public void displayOptions()
    {
        AtomicInteger counter = new AtomicInteger();

        System.out.println(this.title);
        menuOptions_operations.forEach((option) -> {
            System.out.printf("[%d] %s%n]", counter.getAndIncrement(),option);
        });
    }

    public void addMenuOption(String description ,MenuOption operation){
        menuOptions_operations.add(operation);
        menuOptions_descriptions.add(description);
    }

    public void menuInterface(){
        displayOptions();
        System.out.print("Pick your option: ");
        int option = scanner.nextInt();

        while (option < 0 || option >= menuOptions_operations.size()){
            System.out.print("Invalid choice! Pick your option: ");
            option = scanner.nextInt();
        }

        menuOptions_operations.get(option).execute();
    }
}
