package java_06;

public class CompareString {
    public static void main(String[] args) {
        String name1 = "JonI";
        String name2 = "JoNi";

//        if (name1 == name2) {} // nuk krahasohen vlerat me ==

        if (name1.equals(name2)) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        // string1 == string2 kthen 0
        // string1 < string2 kthen < 0
        // string1 > string2 kthen > 0
        if (name1.compareTo(name2) == 0) {
            System.out.println("Emrat jane te njejte");
        } else if (name1.compareTo(name2) < 0) {
            System.out.println("Emri 1 vjen para emrit 2");
        } else if (name1.compareTo(name2) > 0) {
            System.out.println("Emri 2 vjen para emrit 1");
        }

        // JoNi
        // JonI
        // JONI
        if (name1.compareToIgnoreCase(name2) == 0) {
            System.out.println("Emrat jane te njejte");
        } else if (name1.compareToIgnoreCase(name2) < 0) {
            System.out.println("Emrat 1 vjen para emrit 2");
        } else if (name1.compareToIgnoreCase(name2) > 0) {
            System.out.println("Emrat 2 vjen para emrit 1");
        }

        if (name1.toUpperCase().equals(name2.toUpperCase())) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }
    }
}
