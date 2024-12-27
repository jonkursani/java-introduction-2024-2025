package java_11;

public class MethodsExample {
    public static void main(String[] args) {
//        printFullName();
        printFullName("Filan", "Fisteku");
        printFullName("Filane", "Fisteku");
        System.out.println(getFullName("Filan", "Fisteku"));
        String fullName = getFullName("Viona", "Test");
        System.out.println(fullName);

        sumNumbers(); // kllapat e ekzekutojin metoden
        sumNumbers(2, 2);
        sumNumbers(2, "2");
        sumNumbers(4, 4);
        sumNumbers(2, 2, 2);

        System.out.println(sum(5, 5));
        int sum = sum(5, 5);
        System.out.println(sum);
        printInfo("Filan", 18);
        System.out.println(getInfo("Filane", 20));


        checkAge(17);
        System.out.println(getTextForAge(20));
        boolean isAgeValid = isAgeValid(50);
//        if (isAgeValid(30)) {
        if (isAgeValid) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
    }

    public static void printFullName() {
        System.out.println("Filan Fisteku");
    }

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

    // Method Overloading
    // void - nuk kthejne vlere
    public static void sumNumbers() {
        System.out.println(1 + 2);
    }

    // void - metode me parametra
    public static void sumNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void sumNumbers(int num1, String num2) {
        System.out.println(num1 + num2);
    }

    public static void sumNumbers(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
    // end of method overloading

    // kthejne vlere
    public static int sum(int num1, int num2) {
//        int sumNr = num1 + num2;
//        return sumNr;

        return num1 + num2;
    }

    public static void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static String getInfo(String name, int age) {
        return name + " " + age;
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied!");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static String getTextForAge(int age) {
        if (age < 18) {
            return "Access denied!";
        } else {
            return "Access granted!";
        }
    }

    public static boolean isAgeValid(int age) {
//        if (age < 18)
//            return false;
//        else
//            return true;
//
        return age < 18 ? false : true;
    }

}
