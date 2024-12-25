package java_11.ushtrime;

import java.util.Scanner;

public class Ushtrime2 {
//    Krijo aplikacionin qe llogarit “gjysem-faktorielin” e nje numri ne ate
//    menyre qe te menjanohet prodhimi me numrin “3”. Aplikacioni duhet te permbaj sintaksen “continue”
//    Shembull:
//            5! = 5 * 4 * 2 * 1
//            8! = 8 * 7 * 6 * 5 * 4 * 2 * 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin per ta llogaritur faktorielin: ");
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 3) {
                continue;
            }

            sum *= i;
            // sum = sum * i;

        }

        System.out.println("Faktorieli eshte: " + sum);


    }
}
