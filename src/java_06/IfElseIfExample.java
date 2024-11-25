package java_06;

public class IfElseIfExample {
    public static void main(String[] args) {
        int x = 10;

        if(x > 10) {
            System.out.println("x eshte me i madh se 10");
        }

        if (x < 10) {
            System.out.println("x eshte me i vogel se 10");
        }

        System.out.println("x eshte i barabarte me 10");


        if (x > 10) {
            System.out.println("x eshte me i madh se 10");
        } else if (x < 10) {
            System.out.println("x eshte me i vogel se 10");
        } else {
            System.out.println("x eshte i barabarte me 10");
        }

        System.out.println("Ky tekst ekzekutohet");


// !! GABIM: else duhet te jete gjithmon ne fund
//        if (kushti) {
//
//        } else {
//
//        } else if () {
//
//        }

// !! GABIM: nuk mundem me qene dy else vetem nje
//        if (kushti) {
//
//        } else {
//
//        } else {
//
//        }

    }
}
