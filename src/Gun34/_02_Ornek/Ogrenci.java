package Gun34._02_Ornek;

public class Ogrenci {
    private static int sayac = 1;
    private int ID;
    private String isim;
    private TIPI tipi;


    public Ogrenci(String isim, TIPI a) {
        setID(ID);
        setIsim(isim);
        setTipi(a);
    }
    public TIPI getTipi() {
        return tipi;
    }

    public void setTipi(TIPI tipi) {
        this.tipi = tipi;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = sayac++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Ogrenci -> " + getIsim() + " / id " + getID()
                + " / Ortaokul ogrencisi";
    }
}
