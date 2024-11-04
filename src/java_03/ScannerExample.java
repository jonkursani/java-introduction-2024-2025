package java_03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int x = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani emrin: ");
        String firstName = scanner.nextLine(); // lexo nje vlere string (text)

        System.out.print("Shkruani mbiemrin: ");
        String lastName = scanner.nextLine(); // lexo nje vlere string (text)

        System.out.print("Shkruani moshen: ");
        int age = scanner.nextInt(); // lexo nje numer int

        System.out.print("Shkruani gjatesine: ");
        double height = scanner.nextDouble(); // lexo nje numer double

        System.out.print("A jeni student/e: ");
        boolean isStudent = scanner.nextBoolean(); // lexo nje vlere boolean // true, false

//        System.out.printf("Ju keni shkruar %s dhe %s", firstName, lastName);
        System.out.printf("Emri: %s.%n", firstName);
        System.out.printf("Mbiemri: %s.%n", lastName);
        System.out.printf("Mosha: %d.%n", age);
        System.out.printf("Gjatesia: %.2f.%n", height);
        System.out.printf("A eshte student/e: %b.%n", isStudent);
    }
}
