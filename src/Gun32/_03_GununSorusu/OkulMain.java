package Gun32._03_GununSorusu;


public class OkulMain {
    /*
    1- Ogrenci class'i olusturun (fields ad, soyad, yas)
    2- Ogrenci classina ad, soyad ve yas dan olusan bir constructor tanimlayin.
    3- butun field'lar icin encapsulation uygulayin
    4- Okul class'i olusturun (fields okulAd, kontenjan, ArrayList cinsinden ogrencileri olsun)
    5- main metodunun oldugu OkulMain isimli bir sinif olusturun
    6- bir okul nesnesi olusturup , bu okula max ogrenci miktarina ulasana kadar kullanicidan alarak ogrenci ekleyin.
    fakat olusturacagınız ogrencilerin yasi 15 i gecmemeli , bu yasi gecen bir ogrenci eklenmek istenirse yerine
    baska ogrenci isteyin,
    7- ogrencilerin hepsine essiz bir ID atamasi yapin
     */
    public static void main(String[] args) {
        Okul okul1 = new Okul();
        okul1.setOkulAd("Tepetarla Ilkogretim Okulu");
        okul1.setKontenjan(5);
        Okul.ogrenciOlustur(okul1);







    }
}
