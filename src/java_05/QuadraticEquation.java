package java_05;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani a: ");
        double a = Double.parseDouble(sc.nextLine());
//        double a = sc.nextDouble();

        System.out.print("Shkruani b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Shkruani c: ");
        double c = Double.parseDouble(sc.nextLine());

        double diskriminanta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(diskriminanta)) / (2 * a);
        double x2 = (-b - Math.sqrt(diskriminanta)) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
