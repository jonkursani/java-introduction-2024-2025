package java_11.ushtrime;

public class Ushtrime3 {
//    Shfaq matricen e rendit 10x10 me numrat 1-100
    public static void main(String[] args) {


        int num = 1;
//        for (int i = 1; i <= 10; i++) { // iterimi i rreshtave
//            for (int j = 1; j <= 10; j++) { // iterimi i kolonave
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }


        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                num += 10;
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
