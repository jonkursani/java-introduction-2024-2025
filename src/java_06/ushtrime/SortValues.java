package java_06.ushtrime;

import java.util.Scanner;

public class SortValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int a = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a: " + a);
        System.out.println("b: " + b);
//        System.out.println("temp: " + temp); // GABIM varibales temp mundemi me ju qas vetem brenda bllokut IF
    }
}
