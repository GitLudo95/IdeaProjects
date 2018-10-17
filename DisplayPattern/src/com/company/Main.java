package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter line number: ");

        int x = input.nextInt();

        displayPattern(x);

    }
    public static void displayPattern(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int k = n; k>0; k--) {
                if((k-i)<1) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}
