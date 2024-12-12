package java_09.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            System.out.println("**********");
//        }

//        for (int i = 0; i < n; i++) {
//            System.out.println("**********");
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
