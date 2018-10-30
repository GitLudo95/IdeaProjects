package com.company;

public class Main {

    public static void main(String[] args) {
	    Rechthoek rh1 = new Rechthoek(5, 5);
        System.out.println(rh1.toString());
	    rh1.omtrek();

	    Cirkel c1 = new Cirkel(6);
	    c1.omtrek();

	    Vierkant vk1 = new Vierkant(3, 4);
	    vk1.omtrek();
    }
}
