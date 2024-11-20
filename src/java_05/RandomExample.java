package java_05;

import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani rangun deri ku deshironi te gjeneroni nje numer random: ");
//        int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine()); // String => int Integer.parseInt("6") => 6
        double r = Math.random();
        int result = (int) (n * r); // 5.545454545454 => 5
        System.out.println("Rangu: " + n);
        System.out.println("Math.random(): " + r);
        System.out.println("Numri random i gjeneruar eshte: " + result);
    }
}
