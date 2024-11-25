package java_06.ushtrime;


import java.util.Scanner;

public class DetyraNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruani piket: ");
        int piket = sc.nextInt();

        if (piket >= 0 && piket <= 49) {
            System.out.println("Nota juaj eshte 5");
        } else if (piket >= 50 && piket <= 59) {
            System.out.println("Nota juaj eshte 6");
        } else if (piket >= 60 && piket <= 69) {
            System.out.println("Nota juaj eshte 7");
        } else if (piket >= 70 && piket <= 79) {
            System.out.println("Nota juaj eshte 8");
        } else if (piket >= 80 && piket <= 89) {
            System.out.println("Nota juaj eshte 9");
        } else if (piket >= 90 && piket <= 100) {
            System.out.println("Nota juaj eshte 10");
        } else {
            System.out.println("Piket e lejuara jane 0-100");
        }

    }
}
