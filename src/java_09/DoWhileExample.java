package java_09;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
//        for (int i = 1; i > 10; i++) {
//            System.out.print(i + " ");
//        }

//        int i = 1;
//        while (i > 10) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 1;
//        do { // scope i do-while
//            System.out.print(i + " ");
//            i++;
//        } while (i > 10);



        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruani nje numer pozitiv!");

        int n = 0;
        do {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Numri duhet te jete pozitiv!");
            }
        } while (n <= 0);

//        for (;;) {
//            System.out.println("Une jam programer");
//        }

//        for (int i = 1; true; i++) {
//            System.out.println("Une jam programer");
//        }

//        while (true) {
//            System.out.println("Une jam programer");
//        }

        do {
            System.out.println("Une jam programer");
        } while (true);
    }
}
