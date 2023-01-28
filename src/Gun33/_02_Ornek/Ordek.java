package Gun33._02_Ornek;

public class Ordek extends Hayvan{

    private double kanatGenisligi;
    public Ordek(String renk, int kilo, String cinsi, double kanatGenisligi) {
        super.setRenk(renk);
        super.setKilo(kilo);
        super.setCinsi(cinsi);
        setKanatGenisligi(kanatGenisligi);
    }
    public void sesi() {
        System.out.println("vak-vak");
    }

    public double getKanatGenisligi() {
        return kanatGenisligi;
    }

    public void setKanatGenisligi(double kanatGenisligi) {
        this.kanatGenisligi = kanatGenisligi;
    }
}
