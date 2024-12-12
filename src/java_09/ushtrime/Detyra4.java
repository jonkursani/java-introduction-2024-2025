package java_09.ushtrime;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int n = sc.nextInt();

        System.out.print("Shkruani numrin e kolonave: ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
