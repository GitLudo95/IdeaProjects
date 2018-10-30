package com.company;

public class Cirkel extends Vorm {
    private double straal;

    public Cirkel() {
        this.straal = 0;
    }

    public Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    public void omtrek() {
        System.out.println("Omtrek van cirkel is: " + 2 * Math.PI * straal);
    }
}
