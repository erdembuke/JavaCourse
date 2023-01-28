package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    Ogrenci() {     // yapici metodlar : Constructor metodlar
        System.out.println("nesne olusturuldu");
    }

    Ogrenci(int id, String ad, String soyad, int sinif) {     // yapici metodlar : Constructor metodlar
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;

    }

    Ogrenci(int id, String ad, String soyad) {     // yapici metodlar : Constructor metodlar
        this(id, ad, soyad, 0);    // this burda ogrenci metodunun kendisi

        //this.id = id;
        //this.ad = ad;
        //this.soyad = soyad;
        //this.sinif = 0;

    }
}
