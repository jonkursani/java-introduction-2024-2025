package java_08;

public class ForExample {
    public static void main(String[] args) {
        // for (inicializimi; kushti; increment/decrement) { // hapet kllapa
        // scope (trupi) pjesa qe ekzekekutohet // 3
        // } // mbyllet kllapa
        // 1 = inicializimi, 2 = kushti, 3 = scope (trupi), 4 = increment / decrement
        // 1 -> 2 -> 3 -> 4 // hera e pare e ekzekutimit
        // 2 -> 3 -> 4  // pas heres se pare

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }

//        for (char a = 'A'; a <= 'Z'; a++) {
//            System.out.print(a);
//        }
//
//        System.out.println();
//
//        for (char z = 'Z'; z >= 'A'; z--) {
//            System.out.print(z);
//        }

        // 1 + 2 + 3 + 4 + 5 ..........
//        int shuma = 0;
//        for (int i = 1; i <= 10; i++) {
//            shuma = shuma + i;
////            shuma += i;
//        }
//        System.out.println("Shuma eshte: " + shuma);

//        String emri = "Filan";
        // F
        // i
        // l
//        System.out.println(emri.charAt(0));
//        System.out.println(emri.charAt(1));

//        for (int i = 0; i < emri.length(); i++) {
//            System.out.println(emri.charAt(i));
//        }

        // while loop
//        int i = 0; // inicializimi
//        while (i < emri.length()) { // kushti
//            System.out.println(emri.charAt(i)); // scope
//            i++; // increment/decrement
//        }

        // infinite loop
//        for (int i = 0; true; i++) {
//            System.out.println("Infinite loop");
//        }

        // do while loop - per dallim prej while loop ekzekutohet te pakten nje here
//        do {
//
//        }while ();

        // nested for loop
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.printf("%d %d %n", i, j);
            }
        }
    }
}
