package java_04.ushtrime;

import java.util.Scanner;

public class DetyraSyprina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Te gjendet syprina e trekendeshit => s = 1/2 * b * h
//        System.out.print("Jepni bazen: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Jepni lartesine: ");
//        double h = sc.nextDouble();
//
//        double s = 0.5 * b * h;
//        System.out.println("Syprina e trekendeshit eshte: " + s);

        // 2. Gjeni syprinen e katrorit => s = a^2 ose a * a
//        System.out.print("Jepni gjatesine e brinjes: ");
//        double a = sc.nextDouble();
//        double s = a * a;
////        double s = Math.pow(a, 2);
//        System.out.println("Syprina e katrorit eshte: " + s);

        // 3. Gjeni syprinen e drejtkendeshit => s = l * w
//        System.out.print("Jepni gjatesine: ");
//        double l = sc.nextDouble();
//
//        System.out.print("Jepni gjeresine: ");
//        double w = sc.nextDouble();
//
//        double s = l * w;
//        System.out.println("Syprina e drejtkendeshit eshte: " + s);

        // 4. Gjeni syprinen e rrethit => s = PI * r^2
        final double PI = 3.14;
        System.out.print("Jepni rrezen e rrethit: ");
        double r = sc.nextDouble();

        double s = PI * r * r;
//        double s = Math.PI * r * r;
//        double s = Math.PI * Math.pow(r, 2); // pow: r ne fuqine (power) e 2
//        System.out.println("Syprina e rrethit eshte: " + s);
        System.out.printf("Syprina e rrethit eshte: %.2f", s);
    }
}
