package java_09.ushtrime;

import java.util.Scanner;

public class DoWhileDetyra1 {
    public static void main(String[] args) {
        int reversNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin: ");
        int n = sc.nextInt();
        // 123

        do {
            int lastDigit = n % 10; // 123 => 3 // 12 => 2 // 1
            // (0 * 10) + 3 = 0 + 3 = 3 // (3 * 10) + 2 = 30 + 2 = 32
            reversNumber = (reversNumber * 10) + lastDigit;
            n = n / 10; // 123 / 10 = 12 // 12 / 10 = 1
        } while (n > 0);

        // 321
        System.out.println("Numri revers: " + reversNumber);
    }
}
