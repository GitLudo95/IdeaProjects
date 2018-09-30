package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(5, 3, 24));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int kiloBig = bigCount * 5;
        int sumKilo = smallCount + kiloBig;

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;

        } else if(sumKilo < goal) {
            return false;

        } else if((sumKilo - goal) % 5 == 0) {
            return true;

        } else if((kiloBig - goal) % 5 == 0) {
            return true;

        } else if(smallCount > goal % 5) {
            return true;

        } else if(kiloBig > goal) {
            return false;

        } else {
            return true;
        }
    }
}
