package com.tutorial;

public class Main {
    public static void main(String[] args) {
 
        System.out.println("\n");

        // Tipe Data di Java: 
        // integer, byte, short, long, double, float, char, boolean 

        //integer (satuan)
        int i = 2147483647;
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES + " bytes");
        System.out.println("besar integer = " + Integer.SIZE + " bit");

        System.out.println("\n");

        //byte (satuan)
        byte b = 10;
        System.out.println("nilai byte i = " + b);
        System.out.println("nilai byte i = " + (b + 1));
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " bytes");
        System.out.println("besar byte = " + Byte.SIZE + " bit");

        System.out.println("\n");

        //short (satuan)
        short s = 10;
        System.out.println("nilai short i = " + s);
        System.out.println("nilai short i = " + (s + 1));
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + " bytes");
        System.out.println("besar short = " + Short.SIZE + " bit");

        System.out.println("\n");

        //long (satuan)
        long l = 10;
        System.out.println("nilai long l = " + l);
        System.out.println("nilai long l = " + (l + 1));
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + " bytes");
        System.out.println("besar long = " + Long.SIZE + " bit");

        System.out.println("\n");

        //double (desimal)
        double d = 10.5d;
        System.out.println("nilai double i = " + d);
        System.out.println("nilai double i = " + (d + 1));
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("besar double = " + Double.BYTES + " bytes");
        System.out.println("besar double = " + Double.SIZE + " bit");

        System.out.println("\n");

        //float (desimal)
        float f = 10.5f;
        System.out.println("nilai float i = " + f);
        System.out.println("nilai float i = " + (f + 1));
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar float = " + Float.BYTES + " bytes");
        System.out.println("besar float = " + Float.SIZE + " bit");

        System.out.println("\n");

        //char (karakter)
        char c = 'C';
        System.out.println("nilai char c = " + c);
        System.out.println("nilai char c = " + (c + 1));
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + " bytes");
        System.out.println("besar char = " + Character.SIZE + " bit");

        System.out.println("\n");

        //boolean (nilai true atau false)
        boolean val = true;
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);

        System.out.println("\n");
    }
}
