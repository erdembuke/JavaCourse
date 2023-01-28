package Gun34._01_Ornek;

public class Otobus extends Arac{
    private int yolcuSayisi;

    public Otobus(String renk, double motorHacmi, String marka, int yolcuSayisi) {
        super(renk, motorHacmi, marka);
        setYolcuSayisi(yolcuSayisi);
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return super.toString() + " / Yolcu Kapasitesi - " + getYolcuSayisi();
    }
}
