package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Operator Komparasi, ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // Operator equal atau persamaan
        System.out.println("====== PERSAMAAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("\n");

        // Operator not equal atau ketidaksamaan
        System.out.println("====== KETIDAKSAMAAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("\n");

        // Operator less then atau kurang dari
        System.out.println("====== KURANG DARI");
        a = 11;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("\n");

        // Operator greater then atau lebih dari
        System.out.println("====== LEBIH DARI");
        a = 11;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("\n");

        // Operator less then equal atau kurang dari sama dengan
        System.out.println("====== KURANG DARI SAMA DENGAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        
        System.out.println("\n");

        // Operator greater then equal atau lebih dari sama dengan
        System.out.println("====== LEBIH DARI SAMA DENGAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 1;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
    }
}
