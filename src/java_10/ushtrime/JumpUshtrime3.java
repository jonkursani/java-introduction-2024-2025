package java_10.ushtrime;

public class JumpUshtrime3 {
//    Write a program to iterate through numbers from 1 to 20.
//    Use a continue statement to skip odd numbers and print only even numbers.
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
