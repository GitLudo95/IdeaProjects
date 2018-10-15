package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");

        double x = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");

        int y = input.nextInt();

        if(y==0) {
            System.out.println("Enter the dollar amount: ");
        }
        else if(y==1) {
            System.out.println("Enter RMB amount: ");
        } else {
            System.out.println("Invalid amount");
        }

        double z = input.nextDouble();

        switch(y) {
            case 0:
                System.out.println(z + " dollars is " + df2.format(z*x) + " RMB");
                break;

            case 1:
                System.out.println(z + " yuan is " + df2.format(z/x) + " dollars");
                break;
        }
    }
}
