package btvnjavacode_56;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        System.out.println("ma tran A:");
        int[][] A= inputMatrix();
        System.out.println("ma tran B");
        int[][] B= inputMatrix();
        int[][] C=coreMatrix(A,B);
        printMatrix(C);


    }

    public static int[][] inputMatrix() {
        System.out.println("nhap n");
        int n = new Scanner(System.in).nextInt();
        System.out.println("nhap m");
        int m = new Scanner(System.in).nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] coreMatrix(int[][] a, int[][] b){
        int m = a.length;
        int n = a[0].length;
        int k = b[0].length;
        int[][] c = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                int tichmatrix = 0;
                for (int l = 0; l < n; l++) {
                    tichmatrix += a[i][l] * b[l][j];
                }
                c[i][j] = tichmatrix;
            }
        }
        return c;
    }

}
