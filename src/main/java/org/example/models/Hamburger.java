package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String toppingName, double toppingPrice){
        this.addition1Name=toppingName;
        this.addition1Price=toppingPrice;
    }
    public void addHamburgerAddition2(String toppingName, double toppingPrice){
        this.addition2Name=toppingName;
        this.addition2Price=toppingPrice;
    }
    public void addHamburgerAddition3(String toppingName, double toppingPrice){
        this.addition3Name=toppingName;
        this.addition3Price=toppingPrice;
    }
    public void addHamburgerAddition4(String toppingName, double toppingPrice){
        this.addition4Name=toppingName;
        this.addition4Price=toppingPrice;
    }
    public double itemizeHamburger(){
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll price is " + this.price);

        if (this.addition1Name != null) {
            this.price += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null) {
            this.price += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null) {
            this.price += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null) {
            this.price += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return this.price;
    }

}
