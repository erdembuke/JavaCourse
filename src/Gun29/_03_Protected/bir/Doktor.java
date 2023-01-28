package Gun29._03_Protected.bir;

public class Doktor {
    protected String adi; // default ile ayni
    String bolumu; // default
    private String sicilNo;
    public String hastaneAd;

    Doktor() {  // default constructor

    }

    public Doktor(String adi) {
        this.adi = adi;
    }

}
