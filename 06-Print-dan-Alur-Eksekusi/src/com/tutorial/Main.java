// 'com.tutorial' adalah nama paket (package) di sini.
package com.tutorial;

// Ini adalah deklarasi kelas utama bernama 'Main'.
public class Main {

    // Ini adalah metode (fungsi) utama yang akan dijalankan ketika program dimulai.
    public static void main(String[] args) {

        // Ini adalah perintah untuk mencetak teks "hello world!" ke konsol.
        System.out.println("hello world! 1");
        System.out.println("hello world! 2");

        // \n berfungsi untuk membuat garis baru
        System.out.println("\n");

        System.out.print("hello world! 1");
        System.out.print("hello world! 2");

        System.out.println("\n\n");

        System.out.print("hello world! 1 \n");
        System.out.print("hello world! 2 \n");
        System.out.print("hello world! 3");

        System.out.println("\n\n");

        // 'printf' untuk memformat dan mencetak teks dengan nilai variabel. 
        // "%d" adalah spesifikasi format untuk integer, dan akan digantikan dengan nilai 212.
        System.out.printf("wiro sableng naga geni %d", 212);
    }
}
