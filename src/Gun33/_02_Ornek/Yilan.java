package Gun33._02_Ornek;

public class Yilan extends Hayvan{

    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super.setRenk(renk);
        super.setKilo(kilo);
        super.setCinsi(cinsi);
        setUzunluk(uzunluk);
    }
    public void sesi() {
        System.out.println("tıssssssss");
    }

    private int uzunluk;

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
