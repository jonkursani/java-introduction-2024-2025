package java_10.ushtrime;

public class JumpUshtrime2 {
    public static void main(String[] args) {
//        Write a program that iterates through numbers
//        from 1 to 100.
//        Use a loop with a break statement to stop when the first multiple of 7 is found,
//        and print the number.
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
