package org.dev.Menu;

import java.util.Scanner;

public class MenuController<T> {
    private Menu<T> menu;
    private MenuInput menuInput;

    public MenuController(Menu menu, MenuInput menuInput) {
        this.menu = menu;
        this.menuInput = menuInput;
    }

    public MenuController(Menu menu) {
        this(menu, new MenuInput() { // Anonimowa klasa implementująca MenuInput
            private Scanner scanner = new Scanner(System.in);

            @Override
            public int getUserInput() {
                System.out.print("Pick your option: ");
                return scanner.nextInt();
            }
        });
    }

    public T getAnswer(){
        menu.getMenuDisplay().displayOptions();
        int option = menuInput.getUserInput();

        while (option < 0 || option >= menu.getMenuOptions().size()){
            System.out.print("Invalid choice! Pick your option: ");
            option = menuInput.getUserInput();
        }

        return menu.getMenuOptions().get(option).execute();
    }
}
