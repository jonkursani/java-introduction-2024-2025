package java_13;

import java.util.Scanner;

public class EnhancedFor {
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers = new int[10]; // [0,.......0]

        Scanner sc = new Scanner(System.in);

        // Mbushja e vargut me vlera nga useri
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Printimi i vlerave te vargut
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Indeksi: %d, Vlera: %d%n", i, numbers[i]);
        }

        // Enhanced for (foreach)
        for (int number : numbers) {
            System.out.printf("Vlera: %d%n", number);
        }
    }
}
