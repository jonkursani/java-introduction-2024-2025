package java_07;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer per diten e javes: ");
        int ditaEJaves = sc.nextInt();

//        if (ditaEJaves == 1) {
//            System.out.println("E hene");
//        } else if (ditaEJaves == 2) {
//            System.out.println("E marte");
//        } // ....
//        else {
//            System.out.println("Nuk ekziston kjo dite e javes 1-7");
//        }

        // ctrl alt L => formatimi i kodit


        switch (ditaEJaves) { // int
            case 1: // int  // ditaEJaves == 1
                System.out.println("E hene");
                break;
            case 2:
                System.out.println("E marte");
                break;
            case 3:
                System.out.println("E merkure");
                break;
            case 4:
                System.out.println("E enjte");
                break;
            case 5:
                System.out.println("E premte");
                break;
            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E diel");
                break;
            default: // else
                System.out.println("Nuk ekziston kjo dite e javes");
                break;
        }

        int x = 3;

//        switch (x) {
//            case 1:
//            case 2:
//                System.out.println(x);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("Numer tjeter");
//                break;
//        }

//        switch (x) {
//            case 1, 2:
//                System.out.println(x);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("Numer tjeter");
//                break;
//        }

        // enhanced switch
        switch (ditaEJaves) { // int
            case 1 -> {
                System.out.println("E hene");
                System.out.println("Rreshti tjeter");
            }
            case 2 -> System.out.println("E marte");
            case 3 -> System.out.println("E merkure");
            case 4 -> System.out.println("E enjte");
            case 5 -> System.out.println("E premte");
            case 6 -> System.out.println("E shtune");
            case 7 -> System.out.println("E diel");
            default -> System.out.println("Nuk ekziston kjo dite e javes");
        }

        String menu = "Admin";
        switch (menu) {
            case "Admin":
                System.out.println("Welcome Admin");
                break;
            case "Dashboard":
                System.out.println("Welcome to Dashboard");
                break;
            case "XYZ":
                System.out.println("Welcome to XYZ");
                break;
            default:
                System.out.println("Page not found");
                break;
        }
    }
}
