package java_09.ushtrime;

import java.util.Scanner;

public class Detyra6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d %n", i, n, (i * n));
        }
    }
}
