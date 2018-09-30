package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(45, 60));
        System.out.println(hasSharedDigit(19, 92));

    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if((numberOne <10 || numberOne >99) || (numberTwo <10 || numberTwo >99)) {
            return false;

        }

        int startingNumberOne = numberOne;
        int startingNumberTwo = numberTwo;

        while(numberOne >=10 && numberTwo >= 10) {
            numberOne /= 10;
            numberTwo /= 10;

            int firstDigitOne = numberOne;
            int firstDigitTwo = numberTwo;

            int lastDigitOne = startingNumberOne % 10;
            int lastDigitTwo = startingNumberTwo % 10;

            if((firstDigitOne == firstDigitTwo || firstDigitOne == lastDigitTwo) || (lastDigitOne == firstDigitTwo || lastDigitOne == lastDigitTwo)) {
                return true;
            }

        }
        return false;
    }
}
