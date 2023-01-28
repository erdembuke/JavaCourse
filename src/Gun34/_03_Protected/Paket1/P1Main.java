package Gun34._03_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan ha = new P1Hayvan();
        ha.ad = "hulusi";           // public erisildi
        ha.yas = 3;                 // default erisildi
        ha.cinsi = "sus kopegi";    // protected erisildi
                                    // ha.renk e erisilemedi - "private" -
    }
}
