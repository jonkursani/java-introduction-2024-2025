package java_05.ushtrime;

import java.util.Scanner;

public class DetyraOperatoret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Detyra 1
//        System.out.print("Shkruani numrin e pare: ");
//        int nr1 = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Shkruani numrin e dyte: ");
//        int nr2 = Integer.parseInt(sc.nextLine());
//
//        System.out.printf("Operatori &: %d & %d = %d%n", nr1, nr2, (nr1 & nr2));
//        System.out.printf("Operatori |: %d | %d = %d", nr1, nr2, (nr1 | nr2));

        // Detyra 2
//        System.out.print("Shkruani nje numer: ");
//        int num = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Per sa bit deshironi ta shtyni ne te majte: ");
//        int leftBit = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Per sa bit deshironi ta shtyni ne te djathte: ");
//        int rightBit = Integer.parseInt(sc.nextLine());
//
//        System.out.printf("%d << %d = %d%n", num, leftBit, (num << leftBit));
//        System.out.printf("%d >> %d = %d%n", num, rightBit, (num >> rightBit));

        // Detyra 3
        System.out.print("Shkruani moshen: ");
        int mosha = sc.nextInt();

        boolean isAgeGreaterThan18 = mosha >= 18;
        boolean isAgeLessThan65 = mosha <= 65;
//        boolean isAgeValid = isAgeGreaterThan18 && isAgeLessThan65;
        boolean isAgeValid = mosha >= 18 && mosha <= 65;
        String result = isAgeValid ? "Ju lejohet hyrja" : "Nuk ju lejohet hyrja";
        System.out.println(result);
    }
}
