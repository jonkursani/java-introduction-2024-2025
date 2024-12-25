package java_11.ushtrime;

import java.util.Scanner;

public class Ushtrime5 {
//    Kerko nga perdoruesi nje tekst dhe shfaq numrin e perseritur te karakterit “a”
//    Kerko nga perdoruesi nje tekst dhe shfaq numrin e perseritur te shkronjes “A” ose “a”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje tekst: ");
        String text = sc.nextLine().trim().toLowerCase();
        int counterA = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                counterA++;
            }
        }

        System.out.println("Shfrytezuesi ka shkruar " + counterA + " here shkronjen a ose A");
    }
}
