package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int saatSayisi = 24;
    final static int dakikaSayisi = 60;
    final static int saniyeSayisi = 60;

    public Sabitler() {
    }

    public static void saniyeHesaplayici(int gun, int saatSayisi , int dakikaSayisi) {
        int saniye;
        saniye = (gun* Sabitler.saatSayisi * Sabitler.dakikaSayisi * Sabitler.saniyeSayisi) +
                (saatSayisi* Sabitler.dakikaSayisi * Sabitler.saniyeSayisi) +
                (dakikaSayisi* Sabitler.saniyeSayisi);

        System.out.println("saniye sayisi = " + saniye);
    }
}
