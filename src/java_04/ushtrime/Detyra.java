package java_04.ushtrime;

import java.util.Scanner;

public class Detyra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Detyra 1: F = m * a
//        System.out.print("Shkruani masen: ");
//        double m = sc.nextDouble();
//
//        System.out.print("Shkruani nxitimin (a): ");
//        double a = sc.nextDouble();
//
//        double f = m * a;
//
////        System.out.printf("Forca eshte: %.2f", (m * a));
//        System.out.printf("Forca eshte: %.2f", f);


        // Detyra 2: F = m * g;
        final double GRAVITY = 9.81;

        System.out.print("Shkruani masen: ");
        double m = sc.nextDouble();

        double f = m * GRAVITY;

        System.out.printf("Forca e gravitetit eshte: %.2f", f);





    }
}
