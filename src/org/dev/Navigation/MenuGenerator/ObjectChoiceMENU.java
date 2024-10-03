package org.dev.Navigation.MenuGenerator;

import org.dev.Menu.Menu;

import java.util.List;

public class ObjectChoiceMENU {

    public static <T> Menu<T> getMenu(String title,List<T> objects){
        Menu<T> menu = new Menu<>(title);
        objects.forEach(object -> {
            menu.addMenuOption(object.toString(), ()->{return object;});
        });
        return menu;
    }
}