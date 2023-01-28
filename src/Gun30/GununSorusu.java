package Gun30;

public class GununSorusu {
    int a;
    static int b = 0; // sen birtanesin 2 tane zaaten olamaz

    void artir() {
        a++;
        b++;
    }

    public static void main(String[] args) {

        GununSorusu soru1 = new GununSorusu();
        soru1.a = 5;

        GununSorusu soru2 = new GununSorusu();
        soru2.a = 7;

        // a nın degeri kac oldu su anda : Burada verilcek cevap hangi a yi soruyosunuz olmali
        // her nesnenin ayri bir a degeri var, soru1 in a=5 , soru2nin ise a=7 degeri var.
        System.out.println("soru1 a degeri = " + soru1.a);
        System.out.println("soru2 a degeri = " + soru2.a);

        // Soru ? b nin degeri kactir , static oldugu icin tek degeri var 0.
        System.out.println("GununSorusu'nun b degeri = " + GununSorusu.b);

        soru1.artir(); // gs1.a = 6 , b = 1
        soru2.artir(); // gs2.a = 8 , b = 2
        System.out.println("soru1.a = " + soru1.a);
        System.out.println("soru2.a = " + soru2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);

    }
}
