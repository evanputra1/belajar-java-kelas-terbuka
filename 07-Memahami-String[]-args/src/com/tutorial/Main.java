// 'com.tutorial' adalah nama paket (package) di sini.
package com.tutorial;

// Ini adalah deklarasi kelas utama bernama 'Main'.
public class Main {

    // Ini adalah metode (fungsi) utama yang akan dijalankan ketika program dimulai.
    // 'args' adalah parameter yang dapat digunakan untuk menerima argumen dari baris perintah.
    public static void main(String[] args) {

        // Ini mencetak argumen pertama dari baris perintah (index 0) ke konsol.
        System.out.println(args[0]);

        // Ini mencetak argumen pertama dari baris perintah (index 1) ke konsol.
        System.out.println(args[1]);

        // Ini mencetak teks "hello world!" ke konsol.
        System.out.println("hello world!");

        // Ini mencetak satu baris kosong menggunakan karakter escape '\n' untuk baris baru.
        System.out.println("\n");

        // Ini menggabungkan teks dan argumen pertama dari baris perintah untuk mencetak pesan "hallo <argumen pertama> ganteng".
        System.out.println("hallo " + args[0] + " ganteng");
    }
}
