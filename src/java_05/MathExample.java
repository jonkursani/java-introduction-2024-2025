package java_05;

public class MathExample {
    public static void main(String[] args) {
        System.out.println("pow: " + Math.pow(5, 2)); // 25
        System.out.println("abs: " + Math.abs(-5)); // 5
        System.out.println("max: " + Math.max(5, 10)); // 10
        System.out.println("min: " + Math.min(5, 10)); // 5
        System.out.println("round: " + Math.round(5.5)); // 6
        System.out.println("round: " + Math.round(5.4)); // 5
        System.out.println("ceil: " + Math.ceil(6.4)); // 7
        System.out.println("floor: " + Math.floor(6.6)); // 6
        System.out.println("random: " + Math.random() * 10); // [0, 1) => 0.9999999
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);
    }
}
