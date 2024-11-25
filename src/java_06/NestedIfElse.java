package java_06;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
//        int nr1 = 1, nr2 = 4, nr3 = 6, largestNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = sc.nextInt();

        System.out.print("Shkruani numrin e trete: ");
        int nr3 = sc.nextInt();

        int largestNumber;

        // nested if statement
        if (nr1 >= nr2) {
//            int largestNumber; // gabim nuk shihet jasht scope-it te kushtit if, na duhet me perdor edhe ne else
            if(nr1 >= nr3) {
                largestNumber = nr1;
            } else {
                largestNumber = nr3;
            }
        } else {
            if(nr2 >= nr3) {
                largestNumber = nr2;
            } else {
                largestNumber = nr3;
            }
        }

        System.out.println("Numri me i madh eshte: " + largestNumber);




    }
}
