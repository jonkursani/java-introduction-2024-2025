package java_09.ushtrime;

public class WhileDetyra6 {
    public static void main(String[] args) {
        char A = 'A'; // 65
        while (A <= 'Z') {
            System.out.print(A);
            A++;
        }

        System.out.println();

        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }

        System.out.println();

        char Z = 'Z';
        while (Z >= 'A') {
            System.out.print(Z);
            Z--;
        }

        System.out.println();

        for (char z = 'Z'; z >= 'A'; z--) {
            System.out.print(z);
        }



    }
}
