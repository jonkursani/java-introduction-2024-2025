package java_10.ushtrime;

import java.util.Scanner;

public class Ushtrime5 {
    public static void main(String[] args) {
//        Merr nje vlere numerike nga perdoruesi ne rangun 1-100
//        Tenton qe te printon numrat nga 1-100 mirepo ndalon printimi ne
//        momentin qe numri e arrin vleren e dhene nga perdoruesi
//        Menaxho aplikacionin ne ate menyre qe te implementoni sintaksen “break”

        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruani nje numer: ");

        int num = sc.nextInt();

        for (int i = 1; i <= 100; i++){
            System.out.println("Printoje is: " + i);
            if (num == i)
                break;

        }


    }
}
