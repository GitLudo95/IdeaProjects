package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean quit = false;

        int digitAmount = 3;

        int winnings = 0;

        int bankAccount = 5000;

        int ticketPrice = 500;

        int jackpot = 10000;

        int SecondPrize = 3000;

        int ThirdPrize = 1000;

        int[] listUser = new int[digitAmount];

        int[] listPC = new int[digitAmount];

        System.out.println("Welcome to the lottery! You start with $" + bankAccount + " cash. You can buy a ticket for $" + ticketPrice);
        System.out.println();

        while(!quit) {

            System.out.println("Do you want to buy a lottery ticket? Enter 'y' for yes or 'n' for no");
            char answer = input.next().charAt(0);
            if(answer == 'n') {
                quit = true;
                System.out.println("Game ended");
                input.close();
                break;
            } else if(answer == 'y') {

            for(int i = 0; i < listUser.length; i++) {
                    System.out.println("Please enter digit " + (i + 1) + ": (enter -1 to exit)");

                    if(input.hasNextInt()) {
                        listUser[i] = input.nextInt();
                    } else {
                        System.out.println("Invalid digit. Please enter a number between 0 (inclusive) and 9 (inclusive)");
                    }

                    if (listUser[i] == -1) {
                        quit = true;
                        System.out.println("Game ended");
                        input.close();
                        break;
                    }

                    if (listUser[i] < -1 || listUser[i] > 9) {
                        System.out.println("Invalid digit. Please enter a number between 0 (inclusive) and 9 (inclusive)");
                        listUser[i] = input.nextInt();
                    }
            }
            if(quit) {
                break;
            }

            System.out.print("The lottery number is ");

            for (int j = 0; j < listPC.length; j++) {
                listPC[j] = (int) (Math.random() * 10);
                System.out.print(listPC[j]);
            }
            System.out.println();

            if (ExactMatch(listPC, listUser)) {
                System.out.println("Exact match: Jackpot! you win $10,000");
                winnings += jackpot - ticketPrice;
            } else if (MatchDigits(listPC, listUser)) {
                System.out.println("Match all digits: Second prize! you win $3,000");
                winnings += SecondPrize - ticketPrice;
            } else if (ContainsDigit(listPC, listUser)) {
                System.out.println("Match one digit: Third prize! you win $1,000");
                winnings += ThirdPrize - ticketPrice;
            } else {
                System.out.println("Sorry: no match");
                winnings += -ticketPrice;
            }
            System.out.println();
            System.out.println("Total winnings is: $" + winnings + ". You now have: $" + (bankAccount + winnings));
            System.out.println();

            if((bankAccount + winnings) <= 0) {
                quit = true;
                System.out.println("You are bankrupt. Game ended");
                input.close();
                break;
            }
            } else {
                System.out.println("Enter 'y' for yes or 'n' for no");
            }
        }
    }
    public static boolean ExactMatch(int[] list1, int[] list2) {
        if(Arrays.equals(list1, list2)) {
            return true;

        } else {
            return false;
        }
    }
    public static void SortArray(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while(swapped) {
            swapped = false;
            j++;
            for(int i = 0; i < array.length - j; i++) {
                if(array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
    public static boolean MatchDigits(int[] list1, int[] list2) {
        SortArray(list1);
        SortArray(list2);

        if(Arrays.equals(list1, list2)) {
            return true;

        } else {
            return false;
        }
    }
    public static boolean ContainsDigit(int[] list1, int[] list2) {
        for(int i = 0; i < list1.length; i++) {
                for(int j = 0; j < list2.length; j++) {
                    if(list1[i] == list2[j]) {
                        return true;
                    }
                }
        }
        return false;
    }
}
