package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4 x 4 matrix: ");
        for(int i = 0; i <matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println(sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double lsum = 0;
        double rsum = 0;

        for(int row = 0, col = 0; row < (m.length); row++, col++) {
            lsum += m[row][row];

            rsum += m[row][((m.length)-1-row)];
        }
        return lsum + rsum;
    }
}
