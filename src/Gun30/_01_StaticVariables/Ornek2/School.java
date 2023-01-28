package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        // Student (id,name,surName)
        // Yukaridaki gibi 5 ogrenci tanimlayin
        // her ogrencinin takip eden bir id si olmali (oto artan)
        // ve en son kac ogrenci oldugunu bulun
        Student ogr1 = new Student("ErdemBuke");
        Student ogr2 = new Student("Mehmet");
        Student ogr3 = new Student("Abdulrezzak");
        // problem : elle yazarak hem id yi takip etmek zorundayim,
        // hem de hata olasiligi yuksek
        System.out.println("ogrenci id " + ogr1);
        System.out.println("ogrenci id " + ogr2);
        System.out.println("ogrenci id " + ogr3);

    }

}
