package java_06;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            System.out.println("X eshte i barabarte me 10");
            System.out.println("Ky eshte nje tekst");
        } else {
            System.out.println("X nuk eshte i barabarte me 10");
        }

        String resultati = (x == 10) ? "X eshte i barabarte me 10" : "X nuk eshte i barabarte me 10";
        System.out.println(resultati);


        if (x == 10)
            System.out.println("X eshte i barabarte me 10");
//            System.out.println("Ky eshte nje tekst"); // GABIM nuk na lejon dy statements nese nuk i perdorim {}
        else
            System.out.println("X nuk eshte i barabarte me 10");


        String result =
                (x > 10) ? "X eshte me i madh se 10" :
                        (x < 10) ? "X eshte me i vogel se 10" : "X eshte i barabarte me 10";
        System.out.println(result);




    }
}
