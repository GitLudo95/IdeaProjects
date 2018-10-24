package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println("To binary is: " + toBinary(number));

    }

    private static final char[] digits = "01".toCharArray();

	private static String toBinary(int num) {
	    if(num < 0) {
	        throw new IllegalArgumentException("Enter a number above 0");
        }
        String binary = "";
	    do {
	        binary = digits[num % 2] + binary;
	        num /= 2;
        } while (num > 0);
	    return binary;
    }
}
