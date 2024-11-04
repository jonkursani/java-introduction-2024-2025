package java_03;

public class StringExample {
    // shkurtesa per metoden main: main
    public static void main(String[] args) {
        String firstName = "Filan";
        String lastName = "Fisteku";
        String numri7 = "7";
        int numri2 = 2;
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        System.out.println("72? " + (numri7 + numri2));

        // Stringu eshte tip complex jo primitiv, stringu eshte Objekt
        String text = "Ky eshte nje tekst";
        System.out.println("Gjatesia e ketij teksti eshte: " + text.length());
        System.out.println("Shkronja e pare e ketij teksti eshte: " + text.charAt(0));
        System.out.println("Shkronja e fundit e ketij teksti eshte: " + text.charAt(text.length() - 1));

    }

}
