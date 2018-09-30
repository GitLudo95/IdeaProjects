package com.company;

public class Main {

    public static void main(String[] args) {
	    areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(3.174, 3.175);

    }
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {

        if ((numberOne * 1000) - (numberTwo * 1000) >= 1d || (numberOne * 1000) - (numberTwo *1000) <= -1d) {
            System.out.println(false);
            return false;

        } else
            System.out.println(true);
            return true;
    }
}
