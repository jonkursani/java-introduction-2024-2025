package java_12;

public class Cards {
    public static void main(String[] args) {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"♣️", "♦️", "❤️", "♠️"};
        // String[] deck = new String[52];
        String[] deck = new String[rank.length * suit.length];


        int z = 0;
        // Mbushja e array
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[z++] = rank[j] + suit[i];
            }
        }

        // Printimi i vlerave
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
        }
    }
}
