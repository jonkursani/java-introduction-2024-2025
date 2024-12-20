package java_10.ushtrime;

import java.util.Scanner;

public class Ushtrime2 {
    public static void main(String[] args) {
        // Printo numrat tek duke perdorur “while”
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj nje numer: ");
        int n = sc.nextInt();

        int counter = 0;

        while (counter <= n){
            if (counter % 2 != 0)
                System.out.print(counter + " ");

            counter++;

        }
    }
}
