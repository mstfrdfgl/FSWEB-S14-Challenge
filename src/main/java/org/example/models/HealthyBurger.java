package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }
    public void addHealthyAddition1(String toppingName,double toppingPrice){
        this.healthyExtra1Name=toppingName;
        this.healthyExtra1Price=toppingPrice;
    }
    public void addHealthyAddition2(String toppingName,double toppingPrice){
        this.healthyExtra2Name=toppingName;
        this.healthyExtra2Price=toppingPrice;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        setPrice(totalPrice);
        return totalPrice;
    }
}
