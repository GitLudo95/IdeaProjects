package com.company;

import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat("0.00");

    public static void main(String[] args) {
	    Stock AandeelOracle = new Stock("ORCL", "Oracle");
	    AandeelOracle.setCurrentPrice(34.35);
        System.out.println("Current price of " + AandeelOracle.getName() + " is: " + AandeelOracle.getCurrentPrice() + " Euro");
	    AandeelOracle.setPreviousClosingPrice(34.5);
        System.out.println("Previous closing price of " + AandeelOracle.getName() + " was: " + AandeelOracle.getPreviousClosingPrice() + " Euro");

        System.out.println(df2.format(AandeelOracle.getChangePercent()) + " %");
    }
}
