package java_09.ushtrime;

import java.util.Scanner;

public class Detyra7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje fjale: ");
        String fjala = sc.nextLine();

        // kimik

        boolean isPalindrome = true;
        for (int i = 0; i < fjala.length(); i++) {
            if(fjala.charAt(i) != fjala.charAt(fjala.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Fjala eshte palindrom");
        } else {
            System.out.println("Fjala nuk eshte palindrom");
        }
    }
}
