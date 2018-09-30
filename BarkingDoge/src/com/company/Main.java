package com.company;

public class Main {

    public static void main(String[] args) {
        bark(true, -1);


    }
    public static boolean bark (boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(false);
            return false;

        } else if((barking) && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println(true);
            return true;

        } else
            System.out.println(false);
            return false;


    }
}