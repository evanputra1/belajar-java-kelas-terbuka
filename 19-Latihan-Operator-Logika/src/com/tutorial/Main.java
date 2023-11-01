package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;

        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda : " + nilaiTebakan);
    }
}
