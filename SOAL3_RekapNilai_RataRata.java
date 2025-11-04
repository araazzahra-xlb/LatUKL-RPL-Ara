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
public class SOAL3_RekapNilai_RataRata {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        double[] nilai = new double[jumlahSiswa]; // wadah nilai siswa

        double total = 0;

        // Input nilai tiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
            total += nilai[i]; // tambahkan ke total
        }

        double rataRata = total / jumlahSiswa; // hitung rata-rata

        System.out.printf("Rata-rata nilai siswa = %.2f%n", rataRata);
    }
}

