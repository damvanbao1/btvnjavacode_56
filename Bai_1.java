package btvnjavacode_56;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        list(1000000,999999999);
        listnumsumdivsibaleby10(7,9);


    }
    public static void list(int a, int b){
        for (int i = a; i < b; i++) {
            int sobandau=i;
            int songhichdao=0;
            int temp=i;
            while (temp>0){
                int digit=temp%10;
                songhichdao=songhichdao*10+digit;
                temp /=10;
            }
            if (sobandau==songhichdao){
                System.out.println(i);
            }
        }
    }
    public static void listnumsumdivsibaleby10( int minDigits, int maxDigits){
        for(int numDigits=minDigits;minDigits<= maxDigits;numDigits++){
            listnumberRecursive("",numDigits,0);
        }
    }
    public static void listnumberRecursive(String current, int remainDigits,int currentSum){
        if (remainDigits==0){
            if (currentSum%10==0){
                System.out.println(current);
            }
            return;
        }
        for (int digit=0;digit<10;digit++){
            listnumberRecursive(current + digit, remainDigits -1 ,currentSum + digit);
        }
    }






}
