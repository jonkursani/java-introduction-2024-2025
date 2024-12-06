package java_08.ushtrime;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a)
        System.out.print("Shkruani nje fjali: ");
        String fjalia = sc.nextLine();

        if (fjalia.isBlank()) {
            System.out.println("Ju nuk keni shkruar asnje fjale ose fjali!");
        } else {
            System.out.println("Numri i karaktereve te kesaj fjalie eshte: " + fjalia.length());

            // b)
            System.out.printf("Shkruani indeksin nga 0 deri ne %d: ", fjalia.length());
            int indeksi = Integer.parseInt(sc.nextLine());
            System.out.println(fjalia.substring(indeksi));

            // c)
            System.out.printf("Shkurani indeksin e mbarimit nga %d deri me %d: ", indeksi, fjalia.length());
            int indeksi2 = Integer.parseInt(sc.nextLine());

            if (indeksi2 > fjalia.length()) {
                System.out.println("Indeksi maksimal i lejuar eshte: " + fjalia.length());
            } else {
                System.out.println(fjalia.substring(indeksi, indeksi2));
            }

            // d)
            System.out.print("Shkruani fjalen qe po kerkoni: ");
            String fjalaEKerkuar = sc.nextLine();

            boolean aEkzistonFjala = fjalia.toLowerCase().contains(fjalaEKerkuar.toLowerCase());

            if (aEkzistonFjala) {
                System.out.println("Fjala e kerkuar gjendet ne fjali.");
            } else {
                System.out.println("Fjala e kerkuar nuk gjendet ne fjali");
            }

            // e)
            System.out.print("Shkurani fjalen qe po kerkoni ta zevendesoni: ");
            String fjalaPerZevendesim = sc.nextLine();

            System.out.print("Shkruani fjalen per zevendesim: ");
            String fjalaZevendesuese = sc.nextLine();

            boolean aEkzistonFjalaPerZevendesim = fjalia.toLowerCase().contains(fjalaPerZevendesim.toLowerCase());

            if (aEkzistonFjalaPerZevendesim) {
                System.out.println(fjalia.toLowerCase().replace(fjalaPerZevendesim.toLowerCase(), fjalaZevendesuese));
            } else {
                System.out.println("Nuk eshte gjetur fjala e kerkuar");
            }
        }
    }
}
