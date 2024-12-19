package java_10.ushtrime;

import java.util.Scanner;

public class JumpUshtrime4 {
    public static void main(String[] args) {
//        Write a program that keeps accepting integers from the user until the user enters -1.
//        Use a break statement to stop the loop.

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruani nje numer: ");
            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("Procesi u terminua");
                break;
            }
            System.out.println("Numri: " + n);
        }
    }
}
