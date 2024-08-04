package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "cow", 19.10, "normal");
        cips="CURVY";
        drink="COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String toppingName, double toppingPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String toppingName, double toppingPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");

    }

    @Override
    public void addHamburgerAddition3(String toppingName, double toppingPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");

    }

    @Override
    public void addHamburgerAddition4(String toppingName, double toppingPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");

    }
}
