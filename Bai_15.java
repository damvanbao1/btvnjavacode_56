package btvnjavacode_56;

import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=nhapsotunhien(sc,"nhap so tu nhien n:");
        int m=nhapsotunhien(sc,"nhap so tu nhin m");
        if (areCoprime(n,m)){
            System.out.println(m+","+n+"la 2 so nguyen to cung nhau");
        }
        else {
            System.out.println(m+","+n+"khong la 2 so nguyen to cung nhau");
        }
    }
    public static int nhapsotunhien(Scanner sc,String a){
        int num;
        do {
            System.out.print(a);
            num =sc.nextInt();
        }while (num<=0);
        return num;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static boolean areCoprime(int a, int b) {
        int gcd = findGCD(a, b);
        return gcd == 1;
    }
}
