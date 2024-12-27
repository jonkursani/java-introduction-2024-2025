package java_11.ushtrime;

public class Ushtrime6 {
    public static void main(String[] args) {
        printOk();
        printMesazhin("Mesazhi OK");
        printMesazhin("Mesazhi tjeter");
        printOk();
        printMesazhin("Finish");
        zbritja(5, 4);
        zbritja(2.5, 2);
        double res = deduction(6, 4);
        System.out.println(res);
        System.out.println(deduction(10, 5));
    }

    public static void printOk() {
        System.out.println("OK");
    }

    public static void printMesazhin(String mesazhi) {
        System.out.println(mesazhi);
    }

    public static void zbritja(double a, double b) {
        System.out.println(a - b);
    }

    public static double deduction(double a, double b) {
        return a - b;
    }
}
