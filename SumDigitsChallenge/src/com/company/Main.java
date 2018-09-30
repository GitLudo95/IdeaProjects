package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits is " + sumDigits(1255));


    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;

        }

        int sum = 0;

        // 125 -> / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(number >0) {

            int digit = number % 10;
            System.out.println(digit);
            // extract the least-significant digit
            sum += digit;

            // drop the least-significant number / 10;
            number /= 10; //same as number = number / 10;
        }
        return sum;

    }
}
