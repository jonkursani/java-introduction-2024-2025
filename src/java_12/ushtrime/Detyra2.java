package java_12.ushtrime;

public class Detyra2 {
    public static void main(String[] args) {
        int num = 10;

        if (isEven(num))
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }

//        return num % 2 == 0 ? true : false;

        return num % 2 == 0;  // (shprehja e ka output true ose false) 1 % 2 == 0 => 1 == 0 => false
    }
}
