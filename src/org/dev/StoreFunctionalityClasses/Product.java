package org.dev.StoreFunctionalityClasses;


public record Product(String shortName, String fullName, String manufacturer, Category category) {

    @Override
    public String toString() {
        return manufacturer + " " + fullName;
    }

    @Override
    public int hashCode() {
        return this.shortName.toUpperCase().hashCode();
    }
}
