package java_05;

public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 5; // 0101
        int y = 3; // 0011

        System.out.println(x & y); // 0001 => 1
        System.out.println(x | y); // 0111 => 7
        System.out.println(x ^ y); // 0110 => 6
        System.out.println(~x); // 1010 => 0101 + 1 => 0110  => -(6) => -6
        System.out.println(x >> 1); // 0101 => 0010 => 2
        System.out.println(x >>> 1); // 0101 => 0010 => 2
     }
}
