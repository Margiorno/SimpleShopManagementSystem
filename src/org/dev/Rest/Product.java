package org.dev.Rest;


enum Category {T_SHIRT, SWEATSHIRT, PANTS, JACKET, SOCKS}

public class Product {

    private final String shortName;
    private final String fullName;
    private final String manufacturer;
    private final Category category;

    public Product(String shortName, String fullName, String manufacturer, Category category) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    @Override
    public String toString() {
        return manufacturer + ", " + fullName;
    }

    @Override
    public int hashCode() {
        return this.shortName.toUpperCase().hashCode();
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Category getCategory() {
        return category;
    }


}
