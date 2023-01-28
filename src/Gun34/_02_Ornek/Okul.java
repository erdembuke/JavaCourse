package Gun34._02_Ornek;

public class Okul {
    // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
    // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
    // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
    // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
    // 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Erdem",TIPI.ORTA);
        System.out.println("ogrenci1 = " + ogrenci1);

        IlkOgrenci ogrenci2 = new IlkOgrenci("umut", TIPI.ILK,"Satranc");
        System.out.println("ogrenci2 = " + ogrenci2);

        LiseOgrencisi ogrenci3 = new LiseOgrencisi("seyma", TIPI.LISE,"EA");
        System.out.println("ogrenci3 = " + ogrenci3);



    }
}
