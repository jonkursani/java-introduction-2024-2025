package java_12;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        // Deklarimi i array
        int[] intArray; // deklarimi e vendos ne stack
        intArray = new int[5]; // e vendos ne heap
        // tipet primitive marrim vlerat default 0, perpos boolean vleren default false
        // tipet reference vleren default e kan null [null, null]
        // inicializimi rezervimi i memories ne heap per 5 items [0,0,0,0,0]
        byte[] byteArray = new byte[10];
        double[] doubleArray = new double[10];
        String[] stringArray = new String[10];

        // Popullimi i array-it
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Lexo vlerat ne pozita te caktuara
        System.out.println(intArray[0]);
        System.out.println(intArray[2]);
        // System.out.println(intArray); // printoni vetem referencen
        // System.out.println(intArray[5]); // gabim nuk ekziston ky index

        // Array initializer
//        String[] students = new String[] {"Vjosa", "Rion", "Denis", "Viona"};
        String[] students = {"Vjosa", "Rion", "Denis", "Viona"};
        int[] numbers = {1, 2, 3, 4};
        System.out.println(students[2]);
        System.out.println(numbers[3] + " " + numbers[1]);

        // Property: length
        System.out.println("Studentet: " + students.length);
        System.out.println("Numrat:"  + numbers.length);

        // Methods: sort, fill
        numbers[0] = 5;

        // Printimi i vlerave te array-it
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        Arrays.sort(numbers);
//        Arrays.fill(numbers, 5);

        // Printimi i vlerave te array-it
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Printimi reverse
        for (int i = students.length - 1; i >= 0; i--) {
            System.out.print(students[i] + " ");
        }
    }
}
