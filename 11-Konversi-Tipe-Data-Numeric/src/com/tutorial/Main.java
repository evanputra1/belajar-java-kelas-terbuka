package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // Konversi tipe data
        int nilaiInt = 256; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperluas rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        // Don't ❌
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f\n", a, b, c);

        //Do ✅
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n", x, y, z);
    }
}
