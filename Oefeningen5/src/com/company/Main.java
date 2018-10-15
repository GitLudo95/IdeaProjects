package com.company;
import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++) {
//            System.out.println(i + "    " + (i*1.609));
//        }
//
//        System.out.println("Miles   Kilometers  |   Kilometers  Miles");
//
//        for(int i = 1, j = 20; i<=10; i++, j+=5) {
//            System.out.printf(i + "        " + (i*1.609) + "     |      " + j + "         " + (j/1.609));
//            System.out.println();
//            }

        double tuitionOne = 10000;
        double tuitionTwo = 10000;
        double increase = 0.05;
        double sumOne = 0;
        double sumTwo = 0;

        for(int i = 1; i<= 10; i++) {
            tuitionOne += (tuitionOne * increase);
            sumOne += tuitionOne;
            System.out.println(i + "    " + df2.format(tuitionOne) + " Euro");
        }
        for(int j = 1; j<= 14; j++) {
            tuitionTwo += (tuitionTwo * increase);
            sumTwo += tuitionTwo;
        }
        System.out.println("Total cost of four years worth of tuition is " + df2.format((sumTwo - sumOne)) + " Euro");

    }
}
