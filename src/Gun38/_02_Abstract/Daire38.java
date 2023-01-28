package Gun38._02_Abstract;

public class Daire38 extends Sekil{
    private int yariCap;

    public Daire38(int yariCap) {
        setYariCap(yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    double alan() {
        return (Math.PI * (getYariCap()*getYariCap()));
    }

    @Override
    double cevre() {
        return (2 * Math.PI * getYariCap());
    }
}
