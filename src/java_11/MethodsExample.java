package java_11;

public class MethodsExample {
    public static void main(String[] args) {
//        printFullName();
        printFullName("Filan", "Fisteku");
        printFullName("Filane", "Fisteku");
        System.out.println(getFullName("Filan", "Fisteku"));
        String fullName = getFullName("Viona", "Test");
        System.out.println(fullName);
    }

//    public static void printFullName() {
//        System.out.println("Filan Fisteku");
//    }

    public static void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        int numri = 1;
        fullName += numri;
//        return firstName + " " + lastName;
        return fullName;
    }
}
