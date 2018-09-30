package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(salarisAanbod(1800));

    }

    public static String salarisAanbod (int aanbod) {

        if(aanbod >= 2400) {
            return "Acceptabel";

        } else {
            return "Onacceptabel";
        }
    }
}
