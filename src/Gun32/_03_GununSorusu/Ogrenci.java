package Gun32._03_GununSorusu;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;

    private int ID;

    static int sayac = 1;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }
    int getNumber() {
        return ID;
    }
    public void setNumber() {
        this.ID = sayac++;
    }

    String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0)
            System.out.println("Gecersiz yas");
        else this.yas = yas;
    }

    public String toString() {
        return "1. Ogrenci - " + ad + " - " + soyad + " - " + yas + " - " + ID;
    }
}

