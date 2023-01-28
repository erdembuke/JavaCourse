package Gun32._01_Encapsulation;

public class KisiMain {

    public static void main(String[] args) {

        Kisi kisi1 = new Kisi();
        // kisi1.adi = "erdem";
        // kisi1.soyadi = "temur";
        // kisi1.yas = -25;
        kisi1.setAd("erdem");
        kisi1.setSoyad("buke");
        kisi1.yasAta(-25);

        System.out.println("kisi1.yasVer() = " + kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);

        // degiskene direk erisimi kapatip
        // bir metod ile korumali veri gonderme ve alma
        // islemine Encapsulation denir.
    }
}
