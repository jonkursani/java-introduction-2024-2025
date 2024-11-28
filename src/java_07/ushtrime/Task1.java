package java_07.ushtrime;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin per menu-te e aplikacionit: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("View");
                break;
            case 4:
                System.out.println("Help");
                break;
            case 5:
                System.out.println("Tools");
                break;
            default:
                System.out.println("Nuk ekziston kjo menu");
                break;
        }

        switch (num) {
            case 1 -> {
                System.out.println("File");
                System.out.println("Rreshti tjeter");
            }
            case 2 -> System.out.println("Edit");
            case 3 -> System.out.println("View");
            case 4 -> System.out.println("Help");
            case 5 -> System.out.println("Tools");
            default -> System.out.println("Nuk ekziston kjo menu");
        }
    }
}
