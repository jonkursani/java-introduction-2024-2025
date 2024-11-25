package java_06.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare:");
        int n1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte:");
        int n2 = sc.nextInt();

        System.out.print("Shkruani operatorin: ");
        char operator = sc.nextLine().charAt(0);


        int res = 0;

        if (operator == '+') {
            res = n1 + n2;
        } else if (operator == '-') {
            res = n1 - n2;
        } else if (operator == '*') {
            res = n1 * n2;
        } else if (operator == '/') {
            if (n2 != 0) {
                res = n1 / n2;
            } else {
                System.out.println("you cant divide by zero");
            }
        } else if (operator == '%') {
            if (n2 != 0) {
                res = n1 % n2;
            } else {
                System.out.println("you cant find modulus of zero");
            }
        } else {
            System.out.println("Operatoret e lejuar jane vetem ( +, -, /, *, % )");
        }

        System.out.println("Rezultati eshte: " + res);
    }
}
