package java_06.ushtrime;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani shkronjen e pare te ngjyres se semaforit: ");
        char a = sc.nextLine().toLowerCase().charAt(0);

        if(a == 'g'){
            System.out.println("Semafori eshte i gjelber");
        } else if (a == 'k') {
            System.out.println("Semafori eshte i kuq");
        } else if (a == 'v') {
            System.out.println("Semafori eshte i verdhe");
        } else {
            System.out.println("Semafori nuk punon");
        }
    }
}
