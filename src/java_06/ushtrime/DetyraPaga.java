package java_06.ushtrime;

import java.util.Scanner;

public class DetyraPaga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruani Pagen!");
        int paga = sc.nextInt();


        if (paga == 0) {
            System.out.println("Personi nuk ka page!");
        } else if (paga > 0 && paga <= 80) {
            System.out.println("Personi merr social");
        } else if (paga > 80 && paga <= 120) {
            System.out.println("Personi eshte Penzioner");
        } else if (paga > 100 && paga <= 180) {
            System.out.println("Personi merr page minimale");
        } else if (paga > 180 && paga <= 300) {
            System.out.println("Personi merr page mesatare");
        } else if (paga > 300 && paga <= 400) {
            System.out.println("Personi merr page te mire!");
        } else if (paga > 400 && paga <= 600) {
            System.out.println("Personi merr page mbi mesataren");
        } else if (paga > 600) {
            System.out.println("Personi merr page te larte!");
        } else {
            System.out.println("Keni shenuar pagen gabim");
        }


//        if (paga >= 0 && paga <= 200)
//        if (paga >= 0) {
//            if (paga <= 200) {
//
//            }
//        }


    }
}
