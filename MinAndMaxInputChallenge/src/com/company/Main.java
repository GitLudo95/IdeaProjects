package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        boolean first = true;

        while(true) {

            System.out.println("Enter a number:");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {

                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                        max = number;
                    }

                if (number < min) {
                        min = number;

                    }

            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Max value is " + max + ", Min value is " + min);
        scanner.close();
    }
}
