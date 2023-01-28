package Gun31._03_Enum;

public class AylarMain {

    public static void main(String[] args) {

        System.out.println("Aylar.AGUSTOS = " + Aylar.AGUSTOS);

        // ayin kac gun surdugunu metod gerekiyor
        // ayin turkce yazilisi metod gerekiyor
        // ayin gercek sira nosu metod gerekiyor

        // Java diyor ki bu sekilde tek bir kelime veya
        // sayi olan degerler olcaksa sana bi kolaylik

        Aylar ay = Aylar.AGUSTOS;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);

        for (Aylar abd : Aylar.values()) {      // hepsini tek tek yazdirir.
            System.out.println(abd.ayAd + " ayi " + abd.ayNo + ". aydir ve " + abd.gunMiktar + " gun surer");
        }
    }
}
