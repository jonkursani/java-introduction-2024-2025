package java_08.ushtrime;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin per ta gjetur faktorielin: ");
        int n = sc.nextInt();
        int faktorieli = 1;

        // 1 * 2 * 3 ......
//        for (int i = 1; i <= n; i++) {
//            faktorieli *= i;
////            faktorieli = faktorieli * i;
//        }

        // 5 * 4 * 3 ......
        for (int i = n; i >= 1; i--) {
            faktorieli *= i;
        }

        System.out.printf("Faktorieli i %d! eshte: %d", n, faktorieli);




    }
}
