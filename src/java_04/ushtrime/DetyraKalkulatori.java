package java_04.ushtrime;

import java.util.Scanner;

public class DetyraKalkulatori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        int num1 = sc.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int num2 = sc.nextInt();

        System.out.println("Llogaritjet aritmetike");
        System.out.println("-----------------------");
        System.out.printf("%d + %d = %d%n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d%n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d%n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d%n", num1, num2, (num1 / num2));
        System.out.printf("%d %% %d = %d%n", num1, num2, (num1 % num2));
        System.out.println("-----------------------");




    }
}
