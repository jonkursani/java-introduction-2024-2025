package java_04.ushtrime;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sa euro keni: ");
        int euro = sc.nextInt();

        System.out.print("Sa cent keni: ");
        int cent = sc.nextInt();

        int parate = (euro * 100) + cent; // parate ne cent

        System.out.println("5-euro: " + (parate / 500));
        parate = parate % 500;

        System.out.println("2-euro: " + (parate / 200));
        parate = parate % 200;

        System.out.println("1-euro: " + (parate / 100));
        parate = parate % 100;

        System.out.println("50-cent: " + (parate / 50));
        parate = parate % 50;

        System.out.println("20-cent: " + (parate / 20));
        parate = parate % 20;

        System.out.println("10-cent: " + (parate / 10));
        parate = parate % 10;

        System.out.println("5-cent: " + (parate / 5));
        parate = parate % 5;

        System.out.println("2-cent: " + (parate / 2));
        parate = parate % 2;

        System.out.println("1-cent: " + parate);
    }
}
