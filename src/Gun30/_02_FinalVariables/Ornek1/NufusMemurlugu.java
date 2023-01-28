package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1 = new Vatandas("Erdem");
        Vatandas v2 = new Vatandas("Nazmiye");
        Vatandas v3 = new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        // v1.tcNo = 456; yaptigimiz zaman hata verdi cunku degismiyo (final) int tcNo;
        // final degiskenlerine sadece 1 kez veri atanabilir
        // o da tanimlarken ya da constructor da

        final double pi = 3.14; // tanimlarken
        // pi = 5 seklinde sonradan degistirilemez final ile yazdigimiz icin
        // Math.PI; javanin nasil yaptigina baktik o da pi sayisini final ile yazmis
    }
}
// final: deger atandiktan sonra degistirilmeyi engelliyor
// bu sebeple hem sabit degerler icin hem de sonradan degismesini istemedigimiz
// degerler icin final kullaniyoruz

// static sayac ise : her yeni nesne olusturuldugunda
// yeni artan deger almasini sagliyor.
