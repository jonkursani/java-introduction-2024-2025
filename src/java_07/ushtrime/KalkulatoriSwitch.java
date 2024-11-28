package java_07.ushtrime;

import java.util.Scanner;

public class KalkulatoriSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani numrin e dyte: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani operatorin: ");
        char operatori = sc.nextLine().charAt(0);

        int result = 0;

        switch (operatori) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Nuk lejohet pjestimi me 0");
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 == 0)
                    System.out.println("Nuk lejohet pjestimi me 0");
                else
                    result = num1 % num2;
                break;
            default:
                System.out.println("Operatori gabim! (+, -, *, /, %)");
                break;
        }

        if (result != 0) {
            System.out.println("Rezulati eshte: " + result);
        }
    }
}
