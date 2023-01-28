package Gun36._06_InterfaceSoru;
    /*
    Kare, Dikdortken sınıflarından oluşacak bir geometri programı
    yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
    (cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
    2 nesne için de main de değer vererek , sonuçlarını yazdırınız.
    */
public class GeometriMain {

    public static void main(String[] args) {
        Kare kare1 = new Kare();
        kare1.cevre(7,7);
        kare1.alan(7,7);

        Dikdortgen dg1 = new Dikdortgen();
        dg1.cevre(10,5);
        dg1.alan(10,5);
    }
}
