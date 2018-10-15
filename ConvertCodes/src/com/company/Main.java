package com.company;

import java.util.Random;
import java.util.Scanner;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter an ASCII code: ");
//
//        int x = input.nextInt();
//
//        char y = (char) x;
//
//        System.out.println("User entered: " + x);
//        System.out.println("Converted to " + y);
//
//        System.out.println("Enter a character: ");
//
//        char a = input.next().charAt(0);
//
//        int b = (int) a;
//
//        System.out.println("User entered: " + a);
//        System.out.println("Converted to " + b);
//
//        System.out.println("Enter a letter: ");
//
//        char i = input.next().charAt(0);
//
//        char j = Character.toLowerCase(i);
//
//        if(j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {
//            System.out.println(i + " is a vowel");
//        } else if (j < 'a' || j > 'z') {
//            System.out.println(j + " is an invalid input");
//        } else {
//            System.out.println(i + " is a consonant");
//        }
//
//        Random r = new Random();
//        int Low = 65;
//        int High = 91;
//        int Result = r.nextInt(High-Low) + Low;
//
//        System.out.println(Result);
//
//        char UpperCase = (char) Result;
//
//        System.out.println(UpperCase);
//
//        System.out.println("Enter a String: ");
//
//        String StringOne = input.nextLine();
//
//        System.out.println("Length is " + StringOne.length());
//        System.out.println("First character is " + StringOne.charAt(0));

        System.out.println("Enter two Strings: ");

        String s1 = input.nextLine();
        String s2 = input.nextLine();

        if(s1.toLowerCase().contains(s2.toLowerCase())) {
            System.out.println(s2 + " is found in String 1");
        } else {
            System.out.println(s2 + " is not found in String 1");
        }

    }
}
