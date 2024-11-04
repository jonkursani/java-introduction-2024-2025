package java_03;

public class DataTypes {
    public static void main(StringExample[] args) {
        // dataType = vlera e variables;

        // byte
        // range: -128 to 127
        // size: 8 bit => 1 byte
        byte myByte; // => deklarimi
        myByte = 123; // => inicializimi

        // short
        // range: -32,768 to 32,767
        // size: 16 bit => 2 byte
        short vitiAktual = 2024; // statement deklarimi dhe inicializimi
        short myFirstShort, mySecondShort; // deklarimi i dy variablave te te njejtit tip ne rreshtin e njejte
        myFirstShort = 30000;
        mySecondShort = 32000;


        // int
        // range: -2^31 to 2^31
        // size: 32 bit => 4 byte
        // alt enter => shkurtese per ndihmese nga intelliJ
        int numriIPopullsise = 1500000;
//        int numriIPopullsise = 1_500_000; // valide: me e lexueshme per sy

        // long => prefix "L" tregon qe variabla eshte e tipit long
        // range: -2^63 to 2^63
        // size: 64 bit => 8 byte
        long distanceToSun = 1234567890123456789L;

        // float
        // size: 32 bit => 4 byte
        float temperaturaSot = 20.5F;

        // double
        // size: 64 bit => 8 byte
        double pi = 3.14159265359;

        // char
        // size: 16 bit => 2 byte
        char shkronjaA = 'A';
        char numri1 = '1';
//        int kodiIShkronjesA = 'A';
        int kodiIShkronjesA = shkronjaA;
        System.out.println("shkronjaA: " + shkronjaA);
        System.out.println("kodiIShkronjesA: " + kodiIShkronjesA);
        char smiley = '\u263A';
//        char smiley = '☺';
        System.out.println("smiley: " + smiley);
//        char shkronjaE = '\u00EB'; => unicode character
        System.out.println("P\u00EBrsh\u00EBndetje!");

        // boolean
        boolean isAlive = true;
        boolean hasMoney = false;
        boolean is1greaterThan2 = (1 > 2);
        System.out.println("is1greaterThan2: " + is1greaterThan2);


        // string literals
        System.out.println("Une quhem 'Emri Mbiemri\'");
        System.out.println("Une quhem \"Emri Mbiemri\"");
        System.out.println("Une quhem \\Emri Mbiemri\\");
        System.out.println("Une quhem Emri \nMbiemri");
        System.out.println("Une quhem Emri \tMbiemri");
        System.out.println("Un\u00EB quhem Emri \bMbiemri");


        /*
           ushtrime me data tipe
        */
        String emri = "Filan";
        String mbiemri;
        mbiemri = "Fisteku";
        short mosha = 22;
        int vitiILindjes = 2000;
        double distancaDeriNeCct = 5.3;
        boolean jamStudent = true;
        float gjatesia = 1.80F;

        System.out.printf("Une quhem %s %s.%n", emri, mbiemri);
        System.out.printf("Mosha ime eshte: %d.%n", mosha);
        System.out.printf("Viti i lindjes: %d.%n", vitiILindjes);
        System.out.printf("Gjatesia ime eshte: %.2f.%n", gjatesia);
        System.out.printf("Distanca nga shtepia ne cct: %.2f km.%n", distancaDeriNeCct);
        System.out.printf("Jam student: %b.%n", jamStudent);
    }
}
