package com.company;

public class Rechthoek extends Vorm {
    private double hoogte;
    private double breedte;

    public Rechthoek() {
        this.hoogte = 0;
        this.breedte = 0;
    }

    public Rechthoek(double hoogte, double breedte) {
        this.hoogte = hoogte;
        this.breedte = breedte;
    }

    @Override
    public void omtrek() {
        System.out.println("Omtrek van rechthoek is: " + 2 * (hoogte + breedte));
    }

    @Override
    public String toString() {
        return "Rechthoek met breedte " + breedte + " en hoogte " + hoogte;
    }
}
