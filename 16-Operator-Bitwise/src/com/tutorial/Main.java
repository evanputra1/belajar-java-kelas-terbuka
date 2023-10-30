package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b;
        String a_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        // Operator SHIFT LEFT
        System.out.println("===== SHIFT LEFT =====");
        b = (byte)(a << 1);
        System.out.println(b);
    }
}
