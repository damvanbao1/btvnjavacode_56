package btvnjavacode_56;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int[] a= inputArray();
        int[] kq = findSecondNum(a);
        if (kq[0]==-1){
            System.out.println("khong co so thu 2");
        }
        else {
            System.out.println("so thu 2 trong day la:"+kq[0]);
            System.out.println("vi tri cua so thu 2 trong day la:"+kq[1]);

        }

    }
    public static int[] findSecondNum(int[] a){
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int index=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                second=max;
                max=a[i];
                index =i;
            }
            else if (a[i]>second && a[i]!=max){
                second=a[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            return new int[]{-1,1};
        }else {
            return new int[]{second,index};
        }
    }
    public static int[] inputArray(){
        System.out.println("nhap vao so luong phan tu");
        int n= new Scanner(System.in).nextInt();
        int[] a= new int[n];
        for (int i = 0;i < n; i++) {
            System.out.print("a["+i+"] =");
            a[i]= new Scanner(System.in).nextInt();
        }
        if (n<2){
            System.out.println("day khong co phan tu de tim so lon thu 2");
        }
        return a;
    }

}
