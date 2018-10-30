package com.company;

public class Vierkant extends Rechthoek {
    private double hoogte;
    private double breedte;

    public Vierkant() {
        this.breedte = 0;
        this.hoogte = 0;
    }

    public Vierkant(double hoogte, double breedte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public void omtrek() {
        System.out.println("Omtrek van vierkant is: " + 2 * (hoogte + breedte));
    }
}
