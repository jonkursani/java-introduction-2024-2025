package java_05.ushtrime;

import java.util.Scanner;

public class DetyraUshtrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Konverto nje numer ne tekst (String)
//        System.out.print("Shkruani nje number per konvertim ne string: ");
////        int n = sc.nextInt();
//        int n = Integer.parseInt(sc.nextLine()); // 5 => konvertimi prej String ne numer
//        String nText = String.valueOf(n); // "5" => konvertimi prej numrit ne String
//        System.out.println("Numri i konvertuar ne tekst eshte: " + nText);
//        System.out.println("Numri i lexuar eshte: " + n);

        // 2. Lexoni dy numra dhe shfaqni shumen e tyre
        System.out.print("Shkruani vleren e pare: ");
//        String xText = sc.nextLine();
//        int x = Integer.parseInt(xText);
        int x = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani vleren e dyte: ");
        int y = Integer.parseInt(sc.nextLine());

        int result = x + y;
        System.out.printf("Shuma e %d dhe %d eshte: %d", x, y, result);
    }
}
