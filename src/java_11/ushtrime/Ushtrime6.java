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
        shtypAlfabetin();
        System.out.println();
        shtypAlfabetin(true);
        System.out.println();
        shtypAlfabetin(false);
        System.out.println();
        System.out.println(prodhimi(5, 5));
        int prodhimi = prodhimi(10, 5);
        System.out.println(prodhimi);
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

    public static void shtypAlfabetin() {
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a + " ");
        }
    }

    public static void shtypAlfabetin(boolean printToLowerCase) {
//        if (printToLowerCase) { // (true ose false)
//            for (char a = 'a'; a <= 'z'; a++) {
//                System.out.print(a + " ");
//            }
//        } else {
//            for (char a = 'A'; a <= 'Z'; a++) {
//                System.out.print(a + " ");
//            }
//        }

        for (char a = 'A'; a <= 'Z'; a++) {
            if (printToLowerCase) {
                System.out.print(String.valueOf(a).toLowerCase() + " ");
            } else {
                System.out.print(a + " ");
            }
        }
    }

    public static int prodhimi(int a, int b) {
        return a * b;
    }
}
