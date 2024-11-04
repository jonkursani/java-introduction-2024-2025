package java_03;

public class Variables {
    public static void main(StringExample[] args) {
        // deklarimi
        int a;
        // inicializmi
        a = 2;

        // deklarimi manual
        int b = 1, c;
        c = 3;

        // deklarimi dhe inicializimi dinamik
        int d = b + c;

        // Scope
        int x = 10;
//        int x = 11;

        if(x == 10) {
            int y;
            y = 10 + x;
            System.out.println("y: " + y);
        }

        System.out.println("x: " + x);
//        System.out.println("y: " + y); // error jasht scope-it



        // Constants
        final byte DITET_E_JAVES = 7;
        final double PAGA_MINIMALE = 350.00;
        // PAGA_MINIMALE = 380.00; // error nuk mundesh me assign perseri nje konstante

        // Strings => bashkesi e karaktereve
        char A = 'A';
        char B = 'B';
        String AB = "AB";

//        int result = 2 + 2 * 2;
        int result = (2 + 2) * 2;
        System.out.println("result: " + result);

        // Operatoret aritmetik => '+','-','*','/','%'
        int numri1 = 10, numri2 = 5;
        int shuma = numri1 + numri2;
        System.out.printf("Shuma e numrit %d dhe %d eshte: %d.%n",
                numri1, numri2, shuma);
        System.out.printf("Ndryshimi i %d dhe %d eshte: %d.%n",
                numri1, numri2, (numri1 - numri2));
        System.out.printf("Prodhimi i %d dhe %d eshte: %d.%n",
                numri1, numri2, (numri1 * numri2));
        System.out.printf("Heresi i %d dhe %d eshte: %d.%n",
                numri1, numri2, (numri1 / numri2));
        System.out.printf("Mbetja e %d dhe %d eshte: %d.%n",
                numri1, numri2, (numri1 % numri2));
    }
}
