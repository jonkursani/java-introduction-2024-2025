package java_05;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani vitin: ");
        int year = Integer.parseInt(sc.nextLine());

        boolean isLeapYear;
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
//        isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println("Is leap year: " + isLeapYear);
    }
}
