package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.67);
        healthyburger.addHamburgerAddition1("Egg", 5.43);
        healthyburger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyburger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
