package java_09;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

//        int count = 0;
//        while (count < 10) {
//            System.out.println("I love Java");
//            count++;
//        }

//        int sum = 0;
//        int counter = 1;
//        while (counter <= 10) {
//            sum = sum + counter;
//            counter++;
////            System.out.println("Shuma: " + sum);
//        }
//        System.out.println("Shuma: " + sum);

        // Shembull kur merrni nje input nga user-i dhe doni me validu vleren e dhene
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        // sc.hasNextInt() kontrollon nese user ka shkru nje numer
        // nese po rezultati eshte true, nese jo rezultati eshte false
        while (!sc.hasNextInt()) { // nese user nuk ka shkru numer => !false = true
            System.out.print("Shkruani nje numer: ");
            sc.nextLine();
        }
        int n = sc.nextInt();
        System.out.println("Numri eshte: " + n);



        // infinite loop
//        while (true) {
//            System.out.println("Infinite loop");
//        }

        // infinite loop
//        int counter = 1;
//        while (counter == 2) {
//            System.out.print("Infinite loop");
//            counter--;
//        }












    }
}
