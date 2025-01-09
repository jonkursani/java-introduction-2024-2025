package java_12.ushtrime;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani gjatesine e vargut: ");
        int n = sc.nextInt();

        // Inicializimi i array
        int[] numbers = new int[n];

        // Assign vlerat random ne pozitat e array-it
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * 101); // (int) 100.9999999 => 100
            numbers[i] = randomNumber;
        }

        // Sort
        // Arrays.sort(numbers);

        // Print elemets
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i != numbers.length - 1 ? "," : ""));
        }

        System.out.println();

        // Print reverse
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + (i != 0 ? "," : ""));
        }

        System.out.println();

        // Shuma e elementeve te vargut
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            // sum = sum + numbers[i];
        }
        System.out.println("Shuma e numrave te vargut eshte: " + sum);

        // Gjeni mesataren e numrave
    }
}
