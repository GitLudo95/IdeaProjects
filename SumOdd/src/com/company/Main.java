package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(4));
        System.out.println(isOdd(10));
        System.out.println(isOdd(20));
        System.out.println(isOdd(5));
        System.out.println(isOdd(17));
        System.out.println(isOdd(23));
        System.out.println(isOdd(27));
        System.out.println(isOdd(-2));

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;

        } else if (number % 2 == 0) {
            return false;

        } else
            return true;

    }

    public static int sumOdd(int start, int end) {

        if((end < start) || (start <= 0)) {
            return -1;
        }

        int sum = 0;

        for(int i= start; i<= end; i++) {

            if(isOdd(i)) {
                sum +=i;
            }
        }
        return sum;
    }
}




