package Gun33._03_GununSorusu;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi, double tazminat) {
        super.setIsim(isim);
        super.setMaas(maas);
        super.setMaasKatSayisi(maasKatSayisi);
        setTazminat(tazminat);
    }

    public double maasHesapla() {
        return super.maasHesapla() + getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return getIsim() + " maas " + getMaas() + " katsayi " + getMaasKatSayisi()
                + " tazminat "  + getTazminat() + " total odenecek para " + maasHesapla();
    }
}
