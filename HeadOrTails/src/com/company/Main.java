package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for heads or 0 for tails: ");

        int x = input.nextInt();
        if(x == 1) {
            System.out.println("User entered heads");
        }
        else if(x == 0) {
            System.out.println("User entered tails");
        } else {
            System.out.println("Invalid number");
        }

        double y = Math.random();

        int a = 0;

        if(y > 0.5) {
            System.out.println("Coin landed on heads");
            a = 1;
        }
        else {
            System.out.println("Coin landed on tails");
            a = 0;
        }

        if(x == a) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
