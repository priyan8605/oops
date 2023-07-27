package oops.questions;

import java.util.Scanner;

public class matrices {
    public static void add(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input of row or column\n");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++)// represent row
        {
            for (int j = 0; j < c1; j++) // represent column
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printmatrix(sum);
    }

    static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 1st matrix ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter matrix values ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns of 2nd matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter matrix values ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st input matrix is ");
        printmatrix(a);
        System.out.println("2nd input matrix is ");
        printmatrix(b);
        System.out.println("sum of matrix is ");
        add(a, r1, c1, b, r2, c2);
    }
}