package Gun30._01_StaticVariables.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd = "Yildirim ilkokulu";
    // sen bir tanesin
    // hepsi icin gecerli tek bir tane eleman
    // tekrarlayan ve tum nesneler icin kullanilacak
    // degiskenler icin STATIC kullaniyoruz
    // static = sen bir tanesin
    // static varsa hafizadan tasarruf saglar. hepsine atanir
    // tek olarak hafizada bulunur
    // tipin , sinifin, classin degiskenioldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci adi = " + ad + " / Ogrenci soyadi = " + soyad + " / Okul ismi = " + okulAd;
    }
}
