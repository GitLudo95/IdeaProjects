package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package: ");

        double x = input.nextDouble();

        double cost = 0;

        if(x > 0 && x <=1) {
            cost = 3.50;
            System.out.println("Cost of shipping is " + cost);
        }
        else if(x > 1 && x <= 3) {
            cost = 5.50;
            System.out.println("Cost of shipping is " + cost);
        }
        else if(x > 3 && x <= 10) {
            cost = 8.50;
            System.out.println("Cost of shipping is " + cost);
        }
        else if (x > 10 && x <= 20) {
            cost = 10.50;
            System.out.println("Cost of shipping is " + cost);
        }
        else if (x > 20) {
            System.out.println("Package cannot be shipped");
        }
        else {
            System.out.println("Enter a number above 0");
        }
    }
}
