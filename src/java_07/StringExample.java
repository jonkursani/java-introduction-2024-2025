package java_07;

public class StringExample {
    public static void main(String[] args) {
        int x = 10; // stack
        int y = x; //
        y = 20;

        System.out.println(x);
        System.out.println(y);


        String s1 = "Hello";
        String s2 = s1;
        s2 = "New hello";

        char[] ch = {'J', 'a', 'v', 'a'};
        String s = new String(ch);
        System.out.println(s);
        String s3 = "Java";
        System.out.println(s3);


        String fjalia = "Sot eshte dite e premte dhe po bie bore";

        // charAt
        System.out.println(fjalia.charAt(2));

        // length
        System.out.println(fjalia.length());

        // format
        System.out.println(String.format("%s %s", "Filan", "Fisteku"));

        // substring(perfshihet, nuk perfshihet)
        System.out.println(fjalia.substring(10));
        System.out.println(fjalia.substring(10, 23));

        // contains
        System.out.println(fjalia.contains("premte"));
        System.out.println(fjalia.contains("shtune"));
        System.out.println(fjalia.contains("Premte".toLowerCase()));

        // join
        String emri = "Filan";
        System.out.println(String.join("-", emri, "Fisteku", "22"));

        // equals
        String emri2 = "filan";
        System.out.println(emri == emri2); // krahason referencen
        System.out.println(emri.equals(emri2)); // krahason vleren
        System.out.println(emri.equalsIgnoreCase(emri2)); // krahason vleren

        // isEmpty, isBlank
        System.out.println("".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" ".trim().isEmpty());
        System.out.println(" ".isBlank());

        if(" ".isBlank()) {
            System.out.println("Nuk ka vlere");
        } else {
            System.out.println("Ka vlere");
        }
    }
}
