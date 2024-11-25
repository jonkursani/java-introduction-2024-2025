package java_06.ushtrime;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int a = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d%n", a, b, (a + b));
        System.out.printf("%d - %d = %d%n", a, b, (a - b));
        System.out.printf("%d * %d = %d%n", a, b, (a * b));
        if (b == 0) {
            System.out.println("Nuk mund te pjestoni me 0");
        } else {
            System.out.printf("%d / %d = %d%n", a, b, (a / b));
        }
        if (b == 0)
            System.out.println("Nuk mund te pjestoni me 0");
        else
            System.out.printf("%d %% %d = %d%n", a, b, (a % b));

    }
}
