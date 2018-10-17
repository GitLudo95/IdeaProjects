package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password: ");

        String x = input.nextLine();

        checkPassword(x);

    }
    public static void checkPassword(String password) {
        int counter = 0;

        int passwordLength = password.length();

        if(passwordLength >= 8) {
            counter ++;
        }
        if(password.matches("[0-9a-zA-Z]+")) {
            counter ++;
        }
        if((password.replaceAll("\\D", "").length()) >= 2) {
            counter ++;
        }
        if(counter == 3) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
