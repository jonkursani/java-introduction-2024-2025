package java_13.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        int[][] numbers = new int[2][2];
        // Mbushja e matrices
        fillMatrix(numbers);
        // Printimi i matrices
        printMatrix(numbers);
    }

    public static void fillMatrix(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print("Shkruani nje numer: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }





}
