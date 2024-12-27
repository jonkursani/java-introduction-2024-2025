package java_11.ushtrime;

import java.util.Scanner;

public class Ushtrime7 {
    public static void main(String[] args) {
        printNumbers(10);
        printNumbers(50);
        printNumbers(20, 30);
        printNumbers(15);
        printNumbers(50, 60);
        System.out.println("Shuma e numrave: " + shumaENumrave("1234"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani numrin per ta gjetur faktorielin: ");
        int number = sc.nextInt();
        System.out.println("Faktorieli " + number + "!: " + faktorieli(number));

        printoMatricen(5, 7, "😊");
        printoMatricen(3, 3, "❤️");
        printoMatricen(2, 4, "🥲");
        printoMatricen(2, 2, "X");
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbers(int fillimi, int mbarimi) {
        for (int i = fillimi; i <= mbarimi; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int shumaENumrave(String numrat) {
        int sum = 0;
        for (int i = 0; i < numrat.length(); i++) {
            // '1' => (int) 49
            sum += Integer.parseInt(numrat.charAt(i) + "");
            // sum += Integer.parseInt(String.valueOf(numrat.charAt(i)));
        }
        return sum;
    }

    public static int faktorieli(int n) {
        int faktorieli = 1;
        for (int i = 1; i <= n; i++) {
            faktorieli *= i;
        }
        return faktorieli;
    }

    public static void printoMatricen(int rreshta, int kolona, String ikona) {
        for (int i = 1; i <= rreshta; i++) {
            for (int j = 1; j <= kolona; j++) {
                System.out.print(ikona + " ");
            }
            System.out.println(); // na qet ne rresht te ri
        }
    }
}
