package java_09.ushtrime;

import java.util.Scanner;

public class WhileDetyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ky program gjen mesataren e notave tuaja");

        System.out.print("Shkruani noten (0 - per tu ndalur): ");
        int nota = sc.nextInt();

        int sum = 0, counter = 0;

        while (nota != 0) {
            sum += nota; // sum = sum + nota;
            counter++;

            System.out.print("Shkruani noten (0 - per tu ndalur): ");
            nota = sc.nextInt();
        }

        double mesatarja = (double) sum / counter;

        System.out.println("Mesatarja juaj eshte: " + mesatarja);
    }
}
