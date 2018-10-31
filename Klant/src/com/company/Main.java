package com.company;

public class Main {

    public static void main(String[] args) {
	    Klant klantA = new Klant();
        Klant klantB = new Klant();
        klantA.setNaam("Lucebert");
        klantB.setNaam("W.F.", "Hermans");
        System.out.println(klantA);
        System.out.println(klantB);
    }
}
