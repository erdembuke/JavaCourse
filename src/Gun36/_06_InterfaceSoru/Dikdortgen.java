package Gun36._06_InterfaceSoru;

public class Dikdortgen implements Geometri{


    @Override
    public void alan(int... kenar) {
        int alan = 1;

        if (kenar.length == 2) {
            for (int i = 0; i < kenar.length; i++) {
                alan *= kenar[i];
            }
            System.out.println("Alan = " + alan);
        }else System.out.println("hata.");
    }

    @Override
    public void cevre(int... kenar) {

        int cvr = 0;

        for (int i = 0; i < kenar.length; i++) {
            cvr += kenar[i];
        }
        System.out.println("Cevre = " + cvr);
    }
}
