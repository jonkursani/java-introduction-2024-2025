package java_10.ushtrime;

import java.util.Scanner;

public class Ushtrime4 {
    // Shkruaj aplikacionin i cili e kerkon nje ID 7-shifrore te perdoruesit.
    // Ne rast kur nuk e ploteson kete kriter, kerko nga perdoruesi qe te shkruaj perseri.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "";
        while(!(id.trim().length() == 7)) {
            System.out.print("Please enter a Id of 7 digits: " );
            id = sc.nextLine();
        }
        System.out.println(id);
    }
}
