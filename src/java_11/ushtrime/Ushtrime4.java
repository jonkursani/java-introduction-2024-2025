package java_11.ushtrime;

import java.util.Scanner;

public class Ushtrime4 {
    public static void main(String[] args) {
//        Krijo aplikacionin i cili e kerkon nga perdoruesi nje tekst dhe te
//        njejtin e kthen ne anen e kundert (reverse) duke perdorur for-loop
//        Shembull: Teksti - itskeT

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje tekst: ");
        String text = sc.nextLine();

        String newText = "";
        for (int i = text.trim().length() - 1;  i >= 0; i--) {
            newText += text.trim().charAt(i);
        }

        System.out.println("Reversed text: " + newText);




    }
}
