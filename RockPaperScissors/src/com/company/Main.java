package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean quit = false;

        int counterX = 0;
        int counterComputer = 0;

        while(!quit) {
            System.out.println("scissor (0), rock (1), paper (2): ");
            int x = input.nextInt();

            int computer = (int) (Math.random() * 3);

            if(computer == 0) {
                System.out.print("The computer is scissor. ");
            }
            else if(computer == 1) {
                System.out.print("The computer is rock. ");
            } else {
                System.out.print("The computer is paper. ");
            }
            if(x == computer) {
                if(x == 0) {
                    System.out.print("You are scissor too. It is a draw");
                    System.out.println();
                }
                if(x == 1) {
                    System.out.print("You are rock too. It is a draw");
                    System.out.println();
                }
                if(x == 2) {
                    System.out.print("You are paper too. It is a draw");
                    System.out.println();
                }
            }
            else if(x == 0 && computer == 2) {
                System.out.print("You are scissor. You won");
                System.out.println();
                counterX ++;
            }
            else if(x == 1 && computer == 0) {
                System.out.print("You are rock. You won");
                System.out.println();
                counterX ++;
            }
            else if(x == 2 && computer == 1) {
                System.out.print("You are paper. You won");
                System.out.println();
                counterX ++;
            }
            else if(x == 0 && computer == 1) {
                System.out.print("You are scissor. You lost");
                System.out.println();
                counterComputer ++;
            }
            else if(x == 1 && computer == 2) {
                System.out.print("You are rock. You lost");
                System.out.println();
                counterComputer ++;
            }
            else if(x == 2 && computer == 0) {
                System.out.print("You are paper. You lost");
                System.out.println();
                counterComputer ++;
            } else {
                System.out.println("Input invalid");
            }

            if(counterX - counterComputer == 3) {
                quit = true;
                input.close();
                System.out.println("-----------------------------------------------");
                System.out.println("Your score was: " + counterX + ". Your opponents score was: " + counterComputer);
                System.out.println("Mission passed!!!");
            }

            if(counterComputer - counterX == 3) {
                quit = true;
                input.close();
                System.out.println("-----------------------------------------------");
                System.out.println("Your score was: " + counterX + ". Your opponents score was: " + counterComputer);
                System.out.println("Mission failed!!!");
            }
        }
    }
}
