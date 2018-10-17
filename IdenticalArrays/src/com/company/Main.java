package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] listOne = new int[6];

        int[] listTwo = new int[6];

        for(int i = 0; i <listOne.length; i++) {
            System.out.println("Please enter value " + (i+1) + " of list one");
            listOne[i] = input.nextInt();
        }

        for(int j = 0; j <listTwo.length; j++) {
            System.out.println("Please enter value " + (j+1) + " of list two");
            listTwo[j] = input.nextInt();
        }

        equals(listOne, listTwo);


    }
    public static boolean equals(int[] list1, int[] list2) {
        if(Arrays.equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
            return true;

        } else {
            System.out.println("Two lists are not strictly identical");
            return false;
        }

    }
}
