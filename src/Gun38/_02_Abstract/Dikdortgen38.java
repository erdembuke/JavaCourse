package Gun38._02_Abstract;

public class Dikdortgen38 extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen38(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alan() {
        return (getKisaKenar()*getUzunKenar());
    }

    @Override
    double cevre() {
        return ((getUzunKenar()*2) + (getKisaKenar()*2));
    }
}
