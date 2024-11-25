package java_06.ushtrime;

public class CoinFlip {
    public static void main(String[] args) {
        double random = Math.random();

        System.out.println("Random: " + random);

        // Menyra 1: me perdorim te kllapave
        if (random < 0.5) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

        // Menyra 2: pa perdorim te kllapave sepse kemi vetem nje statement
        if (random < 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");

        // Menyra 3: perdorimi i operatorit ternar sepse kemi vetem nje statement
        String output = (random < 0.5) ? "Heads" : "Tails";
        System.out.println(output);
    }
}
