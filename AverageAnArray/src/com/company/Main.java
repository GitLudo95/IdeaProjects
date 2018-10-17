package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number " + (i+1));
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        System.out.println("Average is: " + sum / numbers.length);
    }
}
