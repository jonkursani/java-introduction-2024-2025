package java_09.ushtrime;

import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int n = sc.nextInt();

        // Numrat cift
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + ",");
//            }
//        }

        // Numrat tek
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

        // Cift
        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Tek
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
        }




    }
}
