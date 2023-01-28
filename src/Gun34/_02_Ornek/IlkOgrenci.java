package Gun34._02_Ornek;

public class IlkOgrenci extends Ogrenci {
    private String klup;

    public IlkOgrenci(String isim, TIPI a, String klup) {
        super(isim, a);
        setKlup(klup);
    }


    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "Ogrenci -> " + getIsim() + " / id " + getID() + " / Klup "
                + getKlup() + " / Ilkokul ogrencisi";
    }
}
