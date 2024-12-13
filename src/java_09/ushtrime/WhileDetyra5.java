package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int n = sc.nextInt();
        while (n < 2) {
            System.out.print("Shkruani nje numer 2 ose me i madh se 2: ");
            n = sc.nextInt();
        }

        int i = 2;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
//            i += 2;
        }
    }
}
