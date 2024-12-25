package java_11.ushtrime;

public class Ushtrime1 {

    //Printo numrat “tek” nga 1-100 ne ate menyre qe aplikacioni te permbaj sintaksen “continue”
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
