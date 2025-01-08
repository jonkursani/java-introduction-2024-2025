package java_12;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        // Deklarimi i array
        int[] intArray; // deklarimi e vendos ne stack
        intArray = new int[5]; // e vendos ne heap
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

        String[] students = new String[] {"Vjosa", "Rion", "Denis", "Viona"};
        System.out.println(students[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani madhesine e vargut: ");
        int s = scanner.nextInt();
        int[] newArray = new int[s];
    }
}
