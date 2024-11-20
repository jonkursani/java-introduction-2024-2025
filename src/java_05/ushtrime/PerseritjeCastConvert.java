package java_05.ushtrime;

public class PerseritjeCastConvert {
    public static void main(String[] args) {
        // Implicit
        byte a = 55;
        short b = a;
        long c = b;

        short d = 174;
//        byte e = d; // error

        long x = Long.parseLong(String.valueOf(d));


        // Eksplicit
        byte e = (byte)d;
        double y = 2.77;
        int z = (int) y;

        // 10101110 => 174
        // 01010001 => inversi
        //+00000001
       //  01010010 => -82
        System.out.println(e);



        // Ktheje vleren ne string
        int ab = 55;
        System.out.println();





    }
}
