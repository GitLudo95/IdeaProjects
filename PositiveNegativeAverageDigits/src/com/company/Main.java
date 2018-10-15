package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean quit = false;
        int positiveCounter = 0;
        int negativeCounter = 0;
        float sum = 0;

        while(!quit) {
            System.out.println("Enter a digit, enter 0 to exit: ");
            int x = input.nextInt();

            sum += x;

            if(x == 0) {
                quit = true;
            } else if(x >0) {
               positiveCounter ++;
            } else {
                negativeCounter ++;
            }
            System.out.println(positiveCounter + " positive digits and " + negativeCounter + " negative digits");
            System.out.println("Average is " + (sum / (positiveCounter+negativeCounter)));

        }

    }
}
