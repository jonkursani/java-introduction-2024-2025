package java_05;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        // Outputi i operatoreve relacional eshte boolean mundet mi pas dy vlera true ose false (1 ose 0)

        // ==
        System.out.println("x==y: " + (x == y)); // false

        // != => jo e barabarte
        System.out.println("x!=y: " + (x != y)); // true

        // >
        System.out.println("x>y: " + (x > y)); // true

        // <
        System.out.println("x<y: " + (x < y)); // false

        // >=
        System.out.println("x>=y: " + (x >= y)); // true

        // <=
        System.out.println("x<=y: " + (x <= y)); // false

        // ! => negacion => true => false / false => true
        System.out.println("!(x>y): " + (!(x > y))); // false => !(true) => false


        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani piket: ");
        int piket = Integer.parseInt(sc.nextLine());

        boolean kaKaluar = piket > 50;
//        boolean kaKaluar = piket >= 51;

//        System.out.println("Studenti ka kaluar => " + kaKaluar);
//        System.out.printf("Studenti ka kaluar => %b", kaKaluar);

        // ? : => operatori ternar
        // kushti ? true : false
        String result = piket > 50 ? "Studenti ka kaluar" : "Studenti nuk ka kaluar";
        System.out.println(result);








    }
}
