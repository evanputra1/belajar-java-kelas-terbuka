package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda : " + nilaiTebakan);

        // Operasi logika
        statusTebakan = nilaiTebakan == nilaiBenar;
        System.out.println("Status tebakan anda : " + statusTebakan);
        System.out.println("\n");

        // Operasi aljabar boolean (AND, OR)
        System.out.print("Masukan nilai diantara 4 dan 9");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan >= 4) && (nilaiTebakan <= 9);
        System.out.println("Status tebakan anda : " + statusTebakan);

    }
}
