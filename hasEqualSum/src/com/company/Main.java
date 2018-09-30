package com.company;

public class Main {

    public static void main(String[] args) {
	    hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);

    }
    public static boolean hasEqualSum (int numberOne, int numberTwo, int numberThree) {

        if (numberOne + numberTwo == numberThree) {
            System.out.println(true);
            return true;

        } else
            System.out.println(false);
            return false;

    }
}
