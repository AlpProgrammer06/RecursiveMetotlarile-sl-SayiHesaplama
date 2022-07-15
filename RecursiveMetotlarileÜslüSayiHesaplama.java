package com.company;

import java.util.Scanner;

public class Main {

    static  int power(int base , int exponent){
       if(exponent==0){
           return 1;
       }else if(base==0){
           return 0;
       }
       return (base*power( base,exponent-1));


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Üssünü almak istediðiniz sayýyý giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Lütfen Sayýnýn kuvvetini giriniz: ");
        int kuvvet = scanner.nextInt();
        System.out.print("Sonuç: " + power(sayi,kuvvet));

    }
}



