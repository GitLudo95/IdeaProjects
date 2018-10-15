package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int x = input.nextInt();

        System.out.println("You entered " + x + ", the reverse of " + x + " is: ");

        System.out.println(reverseDigits(x));

    }
    public static int reverseDigits(int number) {

        int reverse = 0;

        while(number > 0 || number < 0) {

            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
