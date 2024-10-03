package org.dev.Navigation.Managers;

import org.dev.Menu.Menu;
import org.dev.Menu.MenuController;
import org.dev.Rest.InventoryItem;

import java.util.Scanner;

public class ItemManager {

    public static void manageItem(InventoryItem item){
        var menu = ItemManagementMENU.getMenu(item);
        var menuController = new MenuController(menu);
        menuController.getAnswer();
    }
}

class ItemManagementMENU {

    public static Menu<Void> getMenu(InventoryItem item) {

        String title = "%s%nITEM: %s%nRESERVED/QUANTITY: %s/%s%nPRICE: $%.2f%n%s%nITEM MANAGEMENT:".formatted("-".repeat(40),
                item,item.getQuantityReserved(),item.getQuantityTotal(), item.getItemPrice(),"-".repeat(40));

        Menu<Void> menu = new Menu<>(title);
        menu.addMenuOption("Order more products",()->{
            System.out.print("Order quantity: ");
            item.placeInventoryOrder(new Scanner(System.in).nextInt());
            return null;
        });
        menu.addMenuOption("Set price",()->{
            System.out.print("New price: ");
            item.setItemPrice(new Scanner(System.in).nextDouble());
            return null;
        });
        return menu;
    }
}
