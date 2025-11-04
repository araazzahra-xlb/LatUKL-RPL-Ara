/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ukl_ara;

/**
 *
 * @author araaz
 */

import java.util.Scanner;

public class SOAL2_Faktorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat =  ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus > = 0");
            return;
        }

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println(n + "! = " + hasil);
    }
}
