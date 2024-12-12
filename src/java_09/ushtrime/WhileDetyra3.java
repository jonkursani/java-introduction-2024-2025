package java_09.ushtrime;

public class WhileDetyra3 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            System.out.printf("%d^2 - %.2f %n", counter, Math.pow(counter, 2));
            counter++;
        }

//        for (int counter = 1; counter <= 100; counter++) {
//            System.out.printf("%d^2 - %.2f %n", counter, Math.pow(counter, 2));
//
//        }
    }
}
