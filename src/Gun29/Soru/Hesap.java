package Gun29.Soru;

public class Hesap {
    int yatan=0;
    int cekilen=0;
    private int bakiye;

    public void paraYatir(int miktar) {
        yatan += miktar;
        bakiye += miktar;
    }
    public void paraCek(int miktar) {
        if (bakiye >= miktar) {
            cekilen += miktar;
            bakiye -= miktar;
        }
        else System.out.println("Bakiyenizden yüksek tutar girdiniz.");
    }
    public void bakiyeGoster() {
        System.out.println("bakiyeniz = " + bakiye);
    }

    @Override
    public String toString() {
        return "Hesap / " +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye;
    }
}

