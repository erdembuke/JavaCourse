package Gun33._02_Ornek;
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.
public class HayvanatBahcesi {

    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("siyah-beyaz",15,"husky");
        kopek1.sesi();

        Kedi kedi1 = new Kedi("gray",3,"scottish");
        kedi1.sesi();

        Yilan yilan1 = new Yilan("black",20,"mamba",27);
        yilan1.sesi();
        System.out.println("Yilan1 in uzunlugu " + yilan1.getUzunluk() + " cm");

        Ordek ordek1 = new Ordek("white",10,"duck",47.34);
        ordek1.sesi();
        System.out.println("ordek1.getKanatGenisligi() = " + ordek1.getKanatGenisligi());
    }
}
