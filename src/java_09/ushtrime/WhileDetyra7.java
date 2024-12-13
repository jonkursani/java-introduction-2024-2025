package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sentinel => rojtari // variabla qe e terminon unazen
        final String exit = "exit";
        String input = "";

        while (!input.equalsIgnoreCase(exit)) { // nese nuk e shkrun exit itero
            System.out.print("Shkruani dicka: ");
            input = sc.nextLine();
            System.out.println("Ju keni shkruar: " + input);
        }
    }
}
