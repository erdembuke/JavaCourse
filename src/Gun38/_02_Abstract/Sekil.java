package Gun38._02_Abstract;

public abstract class Sekil {

    private String name;
    abstract double alan();
    abstract double cevre();

    void sekilCiz() {
        if (getClass().getSimpleName().equalsIgnoreCase("Dikdortgen38")) {
            System.out.println("Dikdortgen cizildi");
        }else if (getClass().getSimpleName().equalsIgnoreCase("Daire38")) {
            System.out.println("Daire cizildi");
        }else System.out.println("Bu class , method'a uygun degil");
    }

    public String getName() {
        if (getClass().getSimpleName().equalsIgnoreCase("Dikdortgen38")) {
            return "Sekil dikdortgendir";
        }else if (getClass().getSimpleName().equalsIgnoreCase("Daire38")) {
            return "Sekil Dairedir";
        }else return "Sekil okunamadi";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alan = " + alan() + " / Cevre = " + cevre();
    }
}
