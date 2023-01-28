package Gun36._03_Interface;

public class GeometriMain {

    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz();    // cember cizildi.

        Dikdortgen d = new Dikdortgen();
        d.ciz();    // dikdortgen cizildi

        ICizdirir c2 = new Cember();
        c2.ciz();   // cember cizildi
        // direk olarak sadece interfacedeki
        // ismi veirlmis olanlar metodlara erisebilsin

        cizdirme(c);
        cizdirme(d);
    }
    public static void cizdirme(ICizdirir iciz) {
        iciz.ciz();
    }
}
