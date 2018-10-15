package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else if (z > x && z > y) {
            System.out.println(z);
        }
        if (x > y ^ x > z) {
            System.out.println(x);
        } else if (y > x ^ y > z) {
            System.out.println(y);

        } else if (z > x ^ z > y) {
            System.out.println(z);
        }

        if(x < y && x < z) {
            System.out.println(x);
        }
        else if(y < x && y < z) {
            System.out.println(y);

        }
        else if(z < x && z < y) {
            System.out.println(z);
        }

    }
}
