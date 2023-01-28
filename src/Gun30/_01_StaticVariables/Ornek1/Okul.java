package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
       // Ogrenci ogr1 = new Ogrenci("ismet","temur","yildirim ilkokul");
       // Ogrenci ogr2 = new Ogrenci("erdem","buke","yildirim ilkokul");
       // Ogrenci ogr3 = new Ogrenci("emrah","guney","yildirim ilkokul");
       // Ogrenci ogr4 = new Ogrenci("enes","buke","yildirim ilkokul");
        /// ..
        /// ..
       // Ogrenci ogr499 = new Ogrenci("halit CAN","yesilbas","yildirim ilkokul");
       // Ogrenci ogr500 = new Ogrenci("ayse","yildiz","yildirim ilkokul");

        // hepsinin okul adi ayni , classta static atayip fazladan yazmaktan kurtulduk

        Ogrenci ogr1 = new Ogrenci("ismet","temur");
        Ogrenci.okulAd = "Elmali İ.Ö.O"; // okul ad i degistiriyor
        System.out.println("ogr1 = " + ogr1);

        // ayni verinin cok kez girisi engellendi
        // ayni verinin hafizada NESNE sayisi kadar tekrarlanmasi engellendi

    }
}
