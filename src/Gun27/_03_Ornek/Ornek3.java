package Gun27._03_Ornek;

public class Ornek3 {
    // Bir Universitede ogrencilere ders kaydi yapilacaktir
    // 1- Lesson : fields : name,saat (1-10 arasinda deger aliyor)
    // 2- Student : fields : name , maxSaat , dersleri adinda derslerini listesini tutacak bir liste
    // 3- 3 adet ders olusturun
    // 4- 1 adet ogrenci tanimlayiniz alabilecegi maxCredit(maxSaat) i 10 olsun
    // 5- bu ogrencinin ders listesine açilmis dersleri ekleyin
    //    ders eklerken max alabilecegi saati geçmemeli , geçerse
    //    uyari versin,alabilecegi max saati doldu sekilde
    // 6- Universite kurallarini yazdiran (2 adet) metod ekleyin. en basta yazdirin.

    public static void main(String[] args) {
        Student.universiteKurallari();

        Lesson ders1 = new Lesson();
        ders1.lessonName = "Algoritma";
        ders1.lessonCredit = 4;

        Lesson ders2 = new Lesson();
        ders2.lessonName = "Java";
        ders2.lessonCredit = 4;

        Lesson ders3 = new Lesson();
        ders3.lessonName = "Test Tools";
        ders3.lessonCredit = 3;

        Student ogr1 = new Student();
        ogr1.studentName = "Erdem";
        ogr1.maxCredit = 10;
        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
        ogr1.dersleriYazdir();

        // TODO: daha realistik olanini kendin yap , gereklilikler listesi olusturup.

    }
}
