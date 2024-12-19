package java_10.ushtrime;

import java.util.Scanner;

public class DoWhileUshtrime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani rangun deri ku deshironi ti mbledhni numrat: ");
        int n = sc.nextInt();

        int shuma = 0;
        int i = 1;
        do {
            shuma += i; // shuma = shuma + i
            i++;
        } while (i <= n);

        System.out.println("Shuma e numrave eshte: " + shuma);


    }
}
