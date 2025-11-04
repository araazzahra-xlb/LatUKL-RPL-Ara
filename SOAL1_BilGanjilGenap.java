package com.mycompany.ukl_ara;

import java.util.Scanner;

public class SOAL1_BilGanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan integer: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL");
        }
    }
}
