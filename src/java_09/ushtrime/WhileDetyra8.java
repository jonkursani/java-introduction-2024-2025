package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String STOP = "stop";
        String personi1 = "";
        String personi2 = "";

        while (!(personi1.equalsIgnoreCase(STOP) && personi2.equalsIgnoreCase(STOP))) {
            System.out.print("Personi1: ");
            personi1 = sc.nextLine();

            System.out.print("Personi2: ");
            personi2 = sc.nextLine();
        }










    }
}
