package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Perkalian dan pembagian akan dilakukan terlebih dahulu
        int hasil = 10 / 2 + 5;
        System.out.println(hasil);

        // Jika dilakukan perkalian dan pembagian, maka
        // akan dilakukan operasinya dari kiri ke kanan
        hasil = 5 * 2 / 2;
        System.out.println(hasil);

        // Menggunakan pengelompokan operasi dengan kurung
        hasil = 5 * (2 + 2);
        System.out.println(hasil);

        // Perhitungan persamaan kuadrat
        Scanner userInput = new Scanner(System.in);
        int a, b, c;

        System.out.print("nilai a: ");
        a = userInput.nextInt();
        System.out.print("gradient b: ");
        b = userInput.nextInt();
        System.out.print("bias c: ");
        c = userInput.nextInt();
        int d = (a * b * b) + c;

        System.out.println("nilai d = " + d);
    }
}
