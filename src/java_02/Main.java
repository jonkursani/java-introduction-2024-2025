package java_02;

public class Main {
    public static void main(String[] args) {
        // sout => shkurtesa per System.out.println();
//        System.out.println("Hello World");

        // println()
//        System.out.println("This is a println method");
//        System.out.println("A eshte texti ne rreshtin e njejte?");

        // print()
//        System.out.print("This is a print method ");
//        System.out.println("A eshte texti ne rreshtin e njejte?");

        String firstName = "Filaniii";
        String lastName = "Fistekuuuuu";
        int age = 22;

        // Formatimi i kodit => ctrl alt L
        System.out.println("Une quhem Filan Fisteku dhe jam 22 vjec.");
        System.out.println("Une quhem " + firstName + " " + lastName + " dhe jam " + age + " vjec");
        // souf => shkurtesa per System.out.printf();
        System.out.printf("Une quhem %s %S dhe jam %d vjec.%n", firstName, lastName, age);
        System.out.printf("Une quhem %s %S, paga ime eshte %c%.2f dhe ka rritje prej 20%%.%n", firstName, lastName, '$', 250.35);
    }
}
