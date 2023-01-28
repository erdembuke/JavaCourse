package Gun33._02_Ornek;

public class Kopek extends Hayvan{

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);   // super class = base class (Hayvan)
    }

    @Override
    public void sesi() {
        System.out.println("hav-hav");
    }
}
