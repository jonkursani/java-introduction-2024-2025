package java_04.ushtrime;

import java.util.Scanner;

public class DetyraPerimetri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Gjeni perimetrin e trekendeshit => p = a + b + c
//        System.out.print("Jepni vleren e pare: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Jepni vleren e dyte: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Jepni vleren e trete: ");
//        double c = sc.nextDouble();
//
//        double p = a + b + c;
//        System.out.println("Perimetri i trekendeshit eshte: " + p);

        // 5. Te gjendet hipotenuza nese dihen katetet a = 3 dhe b = 4 => c = sqrt a^2 + b^2
        System.out.print("Jepni kateten a: ");
        double a = sc.nextDouble();

        System.out.print("Jepni kateten b: ");
        double b = sc.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));
//        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenuza eshte: " + c);





    }
}
