package Gun26._03_Ornek;

public class Ornek {
    // 1-Adım : Rectangle isminde ayri bir dosyada olmak uzere sınıf yazin
    //          (properties , fields , ozellik, eleman, items) : width, length
    // 2-Adim : Çevre bulmak uzere Cevre isminde bir metod yazin
    // 3-Adim : Dikdortgenin alanini bulan Alan isimli bir metod yazin.
    // 4-Adim : 1 tane nesneye deger vererek metodlarin sonuclari yazdirin
    public static void main(String[] args) {
        Rectangle dortgen1 = new Rectangle();
        dortgen1.adi = "Kare";
        dortgen1.length = 5;
        dortgen1.width = 5;
        dortgen1.getCevre();
        dortgen1.getAlan();

        Rectangle dikdortgen2 = new Rectangle();
        dikdortgen2.adi = "Dikdortgen";
        dikdortgen2.length = 4;
        dikdortgen2.width = 16;
        dikdortgen2.getCevre();
        dikdortgen2.getAlan();


    }
}
