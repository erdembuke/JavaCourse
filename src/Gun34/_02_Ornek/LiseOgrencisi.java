package Gun34._02_Ornek;

public class LiseOgrencisi extends Ogrenci {
    private String brans;

    public LiseOgrencisi(String isim, TIPI a, String brans) {
        super(isim, a);
        setBrans(brans);
    }


    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogrenci -> " + getIsim() + " / id " + getID() + "/ Brans " + getBrans()
                + " / Lise ogrencisi";
    }
}
