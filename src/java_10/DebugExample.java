package java_10;

import java.util.Scanner;

public class DebugExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // vendosni break point
        // klikoni butonin "bug" per debug
        // klikoni me f7 butonin Step into
        long n = Long.parseLong(sc.nextLine());
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
            // System.out.println("TRACE: " + i + " " + n);
        }

        if (n > 1) {
            System.out.println(n);
        } else {
            System.out.println();
        }
    }
}
