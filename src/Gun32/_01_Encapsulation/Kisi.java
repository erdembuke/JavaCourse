package Gun32._01_Encapsulation;

    public class Kisi {
    private String adi; // 25 karakter olsun
    private String soyadi;
    private int yas;    // korumaya aldik

    void yasAta(int yas) {
        if (yas > 0 && yas < 150) {
            this.yas=yas;
        }else System.out.println("hatali yas");
    }

    int yasVer() {
        return this.yas;
    }

    void setSoyad(String soyad) {
        if(soyad.length() < 25)
            soyadi = soyad;
        else System.out.println("hatali soyad");
    }

    String getSoyad() {
       return this.soyadi;
    }

    void setAd(String ad) {
        if (ad.length() < 25)
            adi = ad;
        else System.out.println("hatali ad");
    }

    String getAd() {
        return this.adi;
    }





    @Override
    public String toString() {
        return adi + " " + soyadi + " " + yas;
    }

}
