package java_09.ushtrime;

public class DoWhileDetyra2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.printf("%d^2 %.2f %n", i, Math.pow(i, 2));
            // i++;
        } while (++i <= 100);
    }
}
