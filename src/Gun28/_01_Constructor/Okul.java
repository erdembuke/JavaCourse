package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();   // nesne olusma ani (new)

        ogr1.id = 5;    // ozelliklerinin degerlerini veriyorum.
        ogr1.ad = "Erdem";
        ogr1.soyad = "Buke";
        ogr1.sinif = 3;
        System.out.println("1. ogr ad " + ogr1.ad);

        // 2. yol
        Ogrenci ogr2 = new Ogrenci(1, "Seyma", "Dalar", 7);
        System.out.println("2. ogr ad " + ogr2.ad);

        Ogrenci ogr3 = new Ogrenci(2, "Ayse", "Bayrak"); // sinif yazilmicagi zaman
        // buna ozel metod yazdik classta

    }
}
