package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;  // hafizada int kadar yer ayiriyor,sadece tam sayi atilabiliyor
        // tam sayilarda default INT

        // tam sayilar
        byte byteDeger = 7;   // -128 127
        short shortDeger = 1645;   // -32000  ..  32000
        int intDeger = 250000; // default olan int TAMSAYILARDA
        long longDeger = 4456456546546544L;

        //  ondalikli sayilar
        double doubleDeger = 3.144543546346324523;  // noktadan sonra 16 hane duyarlidir (DEFAULT OLAN DOUBLE ONDALIKLARDA)
        float floatDeger = 3.1242133211F;     // noktadan sonra 7 hane duyarlidir

        // karakter ve karakterler
        char basHarf = 'A';
        String isim = "Erdem";

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


    }
}
