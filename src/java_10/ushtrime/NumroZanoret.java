package java_10.ushtrime;

import java.util.Scanner;

public class NumroZanoret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje fjali: ");
        String fjalia = sc.nextLine();

        int numriZanoreve = 0, numriBashketingelloreve = 0, numriShenjave = 0;
        final String ZANORET = "aeiouy";
        final String SHENJAT = "?:;!,.";

        for (int i = 0; i < fjalia.length(); i++) {
//            if (fjalia.toLowerCase().charAt(i) == 'a') {}
            char c = fjalia.toLowerCase().charAt(i); // kemi gjet karakterin ne poziten specifike
            String charString = String.valueOf(c); // konvertimi i karakterit ne String
//            String charString = fjalia.charAt(i) + "";
//            if (fjalia.toLowerCase().charAt(i) == 'a') {}
//            if (charString.equalsIgnoreCase("a")) {}

            if (ZANORET.contains(charString)) {
                numriZanoreve++;
//                numriZanoreve += 1;
//                numriZanoreve = numriZanoreve + 1;
            } else if (c >= 'a' && c <= 'z' ) {
                numriBashketingelloreve++;
            } else if (SHENJAT.contains(charString)) {
                numriShenjave++;
            }
//            else {
//                numriShenjave++;
//            }
        }

        System.out.println("Zanore: " + numriZanoreve);
        System.out.println("Bashktingellore: " + numriBashketingelloreve);
        System.out.println("Shenjat e pikesimit: " + numriShenjave);
    }
}
