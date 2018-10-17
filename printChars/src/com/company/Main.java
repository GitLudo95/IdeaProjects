package com.company;

public class Main {

    public static void main(String[] args) {
        printChars('1', 'Z', 10);

    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int counter = 0;

        for(char x = ch1; x <= ch2; x++) {
            System.out.print(x + " ");

            counter ++;

            if(counter % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
