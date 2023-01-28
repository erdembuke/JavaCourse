package Gun38._01_Abstract;

public class OtoMain {
    public static void main(String[] args) {

        // referans   // nesne tipi
        Ford fr = new Ford("mustang", 1995, 4); // ford normal class ve nesne olusturulabilir , yani new yapilabilir
        fr.hizlanmaSuresi();

        // IBinekoto = new IBinekoto();  // Interface lerden nesne olusturulamaz sadece referans tip olabilirler.

        // Referans       // nesne tipi
        BinekOto bo = new Ford("mondeo",2014,100000); // abstract class lardan da nesne olusturulamaz, sadece REFERANS.
    }
}
