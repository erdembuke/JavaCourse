package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();    // giden yok , dönen yok
        toplamYaz(4,5); // giden var , dönen yok (fonksiyonu bir şeye eşitleyebilir misin
        int enb = Math.max(4, 5); // giden var, dönen var
        double sayi = Math.random(); // gideni yok , döneni var.

        enbYaz(4,5);
        int enbuyuk = enbBul(4,5);
        System.out.println("enb = " + enbuyuk);
        // fonksiyonda return oldugu için başka main de yazdirabiliyoruz , dönen var demek.

    }

    public static int enbBul(int a, int b) {
        int donecek = 0;

        if (a > b)
            donecek = a;
        else
            donecek = b;

        return donecek;
    }

    public static void enbYaz(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void toplamYaz(int a, int b) {
        System.out.println(a+b);
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
    }
}
