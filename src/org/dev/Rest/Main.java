package org.dev.Rest;

import org.dev.Navigation.Managers.StoreManager;
import org.dev.StoreFunctionalityClasses.Category;
import org.dev.StoreFunctionalityClasses.Product;
import org.dev.StoreFunctionalityClasses.Store;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        List<InventoryItem> data = dataTest();
        store.importItems(data);

        StoreManager.manageStore(store);







    }

    private static List<InventoryItem> dataTest(){
        List<Product> products = new ArrayList<>();
        List<InventoryItem> items = new ArrayList<>();
        Random rand = new Random();

        products.add(new Product("ACM_AW_TS","Ac Milan Away t-shirt","Puma",Category.T_SHIRT));
        products.add(new Product("RMCF_BLA_BL","Real Madrid black blouse","Adidas",Category.JACKET));
        products.add(new Product("ACM_HO_TS","Ac Milan Home t-shirt","Puma",Category.T_SHIRT));
        products.add(new Product("CHE_AW_TS","Chelsea Away t-shirt","Adidas",Category.T_SHIRT));
        products.add(new Product("WIS_BLA_PA","Wisla Black pants","Adidas",Category.PANTS));
        products.add(new Product("ACM_WHI_PA","Ac Milan White pants","Puma",Category.PANTS));

        products.forEach((product -> items.add(new InventoryItem(product, rand.nextDouble(100,200)))));

        return items;
    }
}
