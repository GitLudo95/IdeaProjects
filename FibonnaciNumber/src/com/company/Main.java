package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean quit = false;

        while(!quit) {
            System.out.println("Enter the position of the Fibonacci sequence you want to see (-1 to quit): ");

            int number = input.nextInt();

            if(number == -1) {
                quit = true;
                break;
            }
            else if(number < 1) {
                System.out.println("Not a valid position");
            }
            else if(number >103) {
                System.out.println("Position too large, please enter a number between 1 and 103");
            } else {
                long[] fibonacciList = new long[number];

                if(number > 0 && number <104) {
                    System.out.print("The Fibonacci value on position " + number + " is: ");
                    Fibonacci(fibonacciList, number - 1);
                    System.out.println();
                }
            }
        }

    }
    public static void Fibonacci(long[] array, int position) {

        long f = 0;
        long g = 1;

        for (int i = 0; i < array.length; i++) {
            position = i;
            f += g;
            g = f - g;
            array[position] = f;
        }
        System.out.println(array[position]);
    }
}