package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // Operator Logika --> Operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, Negasi

        boolean a, b, c;

        // OR / atau (||)
        System.out.println("===== OR (||) =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        
        // AND / dan (&&)
        System.out.println("===== OR (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        
        // XOR / exclusive or (^)
        System.out.println("===== XOR (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        
        // NOT / negasi --> flipping (!)
        System.out.println("===== NEGASI (!) =====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) " + c);

        System.out.println("\n");
    }
}
