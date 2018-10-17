package com.company;

public class Main {

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
	    long [][] matrix = new long[row][col];

	    for(int i = 0; i<matrix.length; i++) {
	        for(int j = 0; j<matrix[i].length; j++) {
	            matrix [i][j] = Math.round(Math.random());
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int p =0;
	    int index = 0;

	    for(int i=0; i < row; i++) {
	        Sum(matrix, i, col);
	        if(p<Sum(matrix, i, col)) {
	            p = Sum(matrix, i, col);
	            index = i;
            }

        }
        System.out.println();
        System.out.println("The largest row index: " + index);
    }
    public static int Sum(long [][]matrix,int row, int col) {
        int s1 = 0;
        for(int a=row, b=0; b<col; b++)
            s1 += matrix[a][b];
        return s1;
    }

}
