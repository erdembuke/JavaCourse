package Gun35._03_Soru;

public class Calisan extends Ogrenci{
    private String departman;
    public Calisan() {

    }

    public Calisan(String ad, String soyad, String gorevi,String departman) {
        super();
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return getAd() + " " + getSoyad() + " / Title -> " + getGorevi() +
                " / Department -> " + getDepartman();
    }
}
