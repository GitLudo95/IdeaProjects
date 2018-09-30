package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(15, 23, 66));

    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if(((numberOne <10 || numberOne >1000) || (numberTwo < 10 || numberTwo >1000) || (numberThree < 10 || numberThree > 1000))) {
            return false;

        }

        int startingNumberOne = numberOne;
        int startingNumberTwo = numberTwo;
        int startingNumberThree = numberThree;

        while(numberOne >=10 && numberTwo >= 10 && numberThree >= 10) {
            numberOne /= 10;
            numberTwo /= 10;
            numberThree /= 10;

            int lastDigitOne = startingNumberOne % 10;
            int lastDigitTwo = startingNumberTwo % 10;
            int lastDigitThree = startingNumberThree % 10;

            if((lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree) || (lastDigitTwo == lastDigitThree)) {
                return true;
            }
        }
        return false;
    }
}
