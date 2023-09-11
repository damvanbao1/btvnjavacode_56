package btvnjavacode_56;

import java.util.Scanner;

public class bai_11 {
    public static void main(String[] args) {
        int[][] a=inputMatrix();
        int max=maxMatrix(a);
        int min=minMatrix(a);
        System.out.println("min la"+min);
        System.out.println(" max la"+max);

    }
    public static int[][] inputMatrix(){
        System.out.println("nhap n");
        int n= new Scanner(System.in).nextInt();
        System.out.println("nhap m");
        int m= new Scanner(System.in).nextInt();
        int[][] a= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j]=new Scanner(System.in).nextInt();
            }
        }
        return a;
    }
    public static int minMatrix(int[][] a) {
        int min = a[0][0];
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    public static int maxMatrix(int[][] a) {
        int max = a[0][0];
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] < max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
