package java_07.ushtrime;

import java.util.Scanner;

public class Prognoza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani ekipin vendas: ");
        String ekipiVendas = sc.nextLine();
        System.out.print("Shkruani ekipin musafir: ");
        String ekipiMusafir = sc.nextLine();

        System.out.println("Shkruani 1 per ekipin vendas: ");
        System.out.println("Shkruani x per barazin: ");
        System.out.println("Shkruani 2 per ekipin musafir: ");

        char resultati = sc.nextLine().charAt(0);
        switch (resultati) {
            case '1':
                System.out.printf(
                        "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (fiton %s)",
                        ekipiVendas, ekipiMusafir, ekipiVendas
                );
                break;
            case '2':
                System.out.printf(
                        "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (fiton %s)",
                        ekipiVendas, ekipiMusafir, ekipiMusafir
                );
                break;
            case 'x', 'X':
                System.out.printf(
                        "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (perfundon me barazim)",
                        ekipiVendas, ekipiMusafir
                );
                break;
            default:
                System.out.println("Keni shkruar prognozen gabim");
                break;
        }

        switch (resultati) {
            case '1' -> {
                System.out.printf(
                        "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (fiton %s)",
                        ekipiVendas, ekipiMusafir, ekipiVendas
                );

//                int x = 1;
//                switch (x) {
//                    case 1 -> System.out.println(1);
//                    default -> System.out.println("nuk eshte 1");
//                }
            }
            case '2' -> System.out.printf(
                    "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (fiton %s)",
                    ekipiVendas, ekipiMusafir, ekipiMusafir
            );
            case 'x', 'X' ->
                    System.out.printf(
                            "Prognoza ime per ndeshjen ndermjet %s vs %s eshte se (perfundon me barazim)",
                            ekipiVendas, ekipiMusafir
                    );
            default -> System.out.println("Keni shkruar prognozen gabim");
        }
    }
}
