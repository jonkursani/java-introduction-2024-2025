package java_09.ushtrime;

import java.util.Scanner;

public class Detyra9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // 1
            // 2
            // 3
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }


            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }



            System.out.println();
        }
    }
}
