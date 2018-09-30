package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome( 1001));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;

        int startingNumber = number;

        while (number > 0 || number < 0) {

            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

        }

        if (startingNumber == reverse) {
            return true;

        } else
            return false;

    }
}
