package java_04;

import java.util.Scanner;

public class ConvertCastExample {
    public static void main(String[] args) {
        // Konvertimi implicit
//        byte a = 42;
//        short b = a; // 42 => short
//        int c = b; // 42 => int
//        long d = c; // 42 => long
//        float e = d; // 42.0 => float
//        double f = e; // 42.0 => double
//
//        System.out.println("" + a); // byte => String

        // Konvertimi eksplicit
        byte a = 55;
//        short b = Short.parseShort(""+a);
        short b = Short.parseShort(String.valueOf(a)); // String.valueOf(a) => "55"
        int c = Integer.parseInt(String.valueOf(b));
        long d = Long.parseLong(String.valueOf(c));
        float e = Float.parseFloat(String.valueOf(d));
        double f = Double.parseDouble(String.valueOf(e));

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);



        // Kastimi (Cast)
//        short test = 300;
//        byte testByte = test;

        int num1 = (int) 2.7192922; // prej double ne int
        System.out.println(num1);
        int num2 = 11 * (int) 0.25;
        System.out.println(num2);
    }
}
