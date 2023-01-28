package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo;

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
        // final degiskenlerine sadece 1 kez veri atanabilir
        // o da tanimlarken ya da constructor da
    }

    @Override
    public String toString() {
        return isim + " " + tcNo;
    }
}
