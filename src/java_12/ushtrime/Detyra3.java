package java_12.ushtrime;

public class Detyra3 {
    public static void main(String[] args) {
        char s = 'A';
        if (isVowel(s)) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static boolean isVowel(char ch) {
        final String vowels = "aeiouy";
        String s = String.valueOf(ch);
//        return s.toLowerCase().contains(vowels); "a" = "aeiouy" // false => gabim
        return vowels.contains(s.toLowerCase());   // "aeiouy" = "a"
    }
}
