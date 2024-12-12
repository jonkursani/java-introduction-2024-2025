package java_09.ushtrime;

import java.util.Scanner;

public class Detyra8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani emrin dhe mbiemrin: ");
        String fullName = sc.nextLine();

//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.toUpperCase().charAt(i));
//        }

        for (int i = fullName.length() - 1; i >= 0; i--) {
            System.out.println(fullName.toUpperCase().charAt(i));
        }
    }
}
