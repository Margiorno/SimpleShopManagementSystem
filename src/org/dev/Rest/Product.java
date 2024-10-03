package org.dev.Rest;


public class Product {

    private final String shortName;
    private final String fullName;
    private final String manufacturer;
    private final Category category;
    private double price;

    public Product(String shortName, String fullName, String manufacturer, Category category, double price) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.manufacturer = manufacturer;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "%s %s: $%.2".formatted(manufacturer, fullName, price);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
