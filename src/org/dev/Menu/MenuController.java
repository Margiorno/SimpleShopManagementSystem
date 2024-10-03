package org.dev.Menu;

public class MenuController<T> {
    private Menu<T> menu;
    private MenuInput menuInput;

    public MenuController(Menu menu, MenuInput menuInput) {
        this.menu = menu;
        this.menuInput = menuInput;
    }

    public T menuInterface(){
        menu.getMenuDisplay().displayOptions();
        int option = menuInput.getUserInput();

        while (option < 0 || option >= menu.getMenuOptions().size()){
            System.out.print("Invalid choice! Pick your option: ");
            option = menuInput.getUserInput();
        }

        return menu.getMenuOptions().get(option).execute();
    }
}
