package java_12.ushtrime;

public class Detyra5 {
    public static void main(String[] args) {
        int num = 1221;

        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }

    public static boolean isPalindrome(int number) {
        String numS = String.valueOf(number);  // "1221"

        String reversedText = "";
        for (int i = numS.length() - 1; i >= 0; i--) {
            reversedText += numS.charAt(i);
        }

        // if (numS == reversedText) {} // krahason referencen
//        if (numS.equals(reversedText)) { // krahason vleren
//            return true;
//        } else {
//            return false;
//        }

        return numS.equals(reversedText);
    }
}
