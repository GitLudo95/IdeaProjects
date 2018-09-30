package com.company;

public class Main {

    public static void main(String[] args) {
	    hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);

    }
    public static boolean hasTeen (int numberOne, int numberTwo, int numberThree) {

        if (numberOne >= 13 && numberOne <= 19 || numberTwo >= 13 && numberTwo <= 19 ||numberThree >= 13 && numberThree <= 19) {
            System.out.println(true);
            return true;

        } else
            System.out.println(false);
            return false;
    }
}
