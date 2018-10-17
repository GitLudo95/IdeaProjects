package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number " + (i+1));
            numbers[i] = input.nextDouble();
        }

        System.out.println("Average of array is: " + Average(numbers));

    }
    public static double Average(double[] array) {
        double sum = 0;

        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
