package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of first and last digit is " + sumFirstAndLastDigit(5275272));


    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;

        } else if (number < 10) {

            int sum = 0;

            while (number > 0) {

                sum = (number % 10) * 2;
                return sum;

            }

        }

            int startingNumber = number;

            int sum = 0;

            while (number >= 10) {
                number /= 10;

                int firstDigit = number;

                int lastDigit = startingNumber % 10;

                sum = firstDigit + lastDigit;

            }
            return sum;
    }
}
