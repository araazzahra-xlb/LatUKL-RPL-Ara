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
public class SOAL2_VolumeTabung {
    

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double r, double t) {
        return Math.PI * r * r * t; // rumus π * r^2 * t
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = sc.nextDouble();

        // Panggil fungsi untuk menghitung volume
        double volume = hitungVolume(r, t);

        // Tampilkan hasil dengan 2 angka di belakang koma
        System.out.printf("Volume tabung = %.2f cm^3%n", volume);
    }
}


