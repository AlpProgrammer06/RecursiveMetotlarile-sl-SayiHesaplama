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
        System.out.print("L�tfen �ss�n� almak istedi�iniz say�y� giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("L�tfen Say�n�n kuvvetini giriniz: ");
        int kuvvet = scanner.nextInt();
        System.out.print("Sonu�: " + power(sayi,kuvvet));

    }
}



