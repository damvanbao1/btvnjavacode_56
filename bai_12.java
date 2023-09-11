package btvnjavacode_56;

import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
        float s=tong();
        System.out.println("tong la: "+s);

    }
    public static float tong(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        int n=sc.nextInt();
        float s=0;
        for (int i=1;i<=n;i++){
            s+=1.0/i;
        }
        return s;
    }
}
