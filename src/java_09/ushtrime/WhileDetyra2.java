package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int num1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int num2 = sc.nextInt();

        int counter = 0;
        while (num1 >= num2) {
            num1 -= num2; // num1 = num1 - num2
            counter++;
        }

        System.out.println("Num 1 permban num 2: " + counter);






    }
}
