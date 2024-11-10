package java_04.ushtrime;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ekipi vendas: ");
        String ekipiVendas = sc.nextLine();

        System.out.print("Ekipi musafir: ");
        String ekipiMusafir = sc.nextLine();

        System.out.print("Numri i tifozeve: ");
        int numriItifozeve = sc.nextInt();
        sc.nextLine(); // me nextLine(); e lexojme "\n" (new line) qe shkaktohet prej tastit "Enter"

        System.out.print("Fusha/Arena: ");
        String fushaArena = sc.nextLine();

        System.out.print("Sa gola ka shenuar " + ekipiVendas + ": ");
        byte golaEkipiVendas = sc.nextByte();

        System.out.print("Sa gola ka shenuar " + ekipiMusafir + ": ");
        byte golaEkipiMusafir = sc.nextByte();

        System.out.println("--------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s - %s %d-%d.%n", ekipiVendas, ekipiMusafir, golaEkipiVendas, golaEkipiMusafir);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent.%n", fushaArena, numriItifozeve);
        System.out.println("--------------------------------");
    }
}
