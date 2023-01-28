package Gun28._04_Constructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
        System.out.println("Bank has been created");
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }


    public String toString() {
        if (kurulusYili == 0) {
            return "Banka adi -> " + adi + " / " + "Sube Sayisi -> " + subeSayisi;
        }else if (subeSayisi == 0) {
            return "Banka adi -> " + adi + " / " + " Kurulus yili -> " + kurulusYili;
        }else return "Banka adi -> " + adi + " / " + "Sube Sayisi -> " + " / " + " Kurulus yili -> " + kurulusYili;

    }
}
