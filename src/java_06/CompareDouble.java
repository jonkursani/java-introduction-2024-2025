package java_06;

public class CompareDouble {
    public static void main(String[] args) {
        double a = 0.1 + 0.2; // 0.3
        double b = 0.3; // 0.3

        double c = 3.0;
        double d = 3.00000001;
        double toleranca = 0.000001;


        if (a == b) {
            System.out.println("a dhe b jane te barabarta");
        } else {
            System.out.println("a dhe b nuk jane te barabarta");
        }

        if (Math.abs(a - b) < toleranca) {
            System.out.println("a dhe b jane te barabarta");
        } else {
            System.out.println("a dhe b nuk jane te barabarta");
        }

        if (c == d) {
            System.out.println("c dhe d jane te barabarta");
        } else  {
            System.out.println("c dhe d nuk jane te barabarta");
        }

        if (Math.abs(c - d) < toleranca) {
            System.out.println("c dhe d jane te barabarta");
        } else  {
            System.out.println("c dhe d nuk jane te barabarta");
        }
    }
}
