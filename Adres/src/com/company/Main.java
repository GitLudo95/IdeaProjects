package com.company;

public class Main {

    public static void main(String[] args) {
	    Adres adres1 = new Adres("15", "9860JC");
        System.out.println(adres1);

        adres1.setStraatNaam("Javastraat");
        adres1.setPlaats("Nieuwegein");
        System.out.println(adres1);
    }
}
