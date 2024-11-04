package java_03.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sa Gola i ka dhen Barcelona: ");
        int gola = sc.nextInt();
        System.out.print("Sa Gola i ka dhen Real Madrid: ");
        int gola2 = sc.nextInt();
        System.out.println("------------------------------");
        System.out.printf("Rezultati i Barcelona vs Real Madrid eshte: %d:%d", gola, gola2);
    }
}
