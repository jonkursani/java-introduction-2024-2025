package java_12;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin e studenteve: ");
//        int n = sc.nextInt();
//        sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        // Krijimi i array-it me size dinamik
        String[] students = new String[n]; // [null, null, null]

        // Popullimi i array-t me vlera nga useri
        for (int i = 0; i < students.length; i++) {
            System.out.print("Shkruani emrin e studentit " + (i + 1) + ": ");
            students[i] = sc.nextLine().trim();
        }

        System.out.println("----------- Lista e studenteve -----------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Emri i studentit => " + (i + 1) + "-" + students[i]);
        }
    }
}
