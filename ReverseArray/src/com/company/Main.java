package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter int # " + (i+1));
            numbers[i] = input.nextInt();
        }
        System.out.print("Reversed array is: ");
        for(int j = numbers.length-1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
    }
}
