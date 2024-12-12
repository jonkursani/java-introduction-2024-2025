package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje fjale: ");
        String fjala = sc.nextLine();
        int indeksiIFundit = fjala.length() - 1;
        String tekstiIRi = "";
        while (indeksiIFundit >= 0) {
            tekstiIRi += fjala.charAt(indeksiIFundit);
            indeksiIFundit--;
        }

        if (fjala.equalsIgnoreCase(tekstiIRi)) {
            System.out.println("Fjala eshte palindrom");
        } else {
            System.out.println("Fjala nuk eshte palindrom");
        }

        // Jon
        // length 3
        // lastIndex = 2
        // 2 1 0





    }
}
