package Gun15;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
        // asagidaki goruntuyu veren programi yazin (sadece 1 yildiz ile)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        // BU ÇÖZÜMÜ ÖYLESİNE ÇÖZDÜ HOCA YOK GİBİ DAVRANIN .
        // TODO: kendini gelistirmek adına bunu gozden gecir. cozumu bul.

        int sinir = 0;
        boolean altTaraf = false;

        for (int satir = 1; satir <= 5; satir++) { // satir = 1,2,3,4,5 sonra 5,4,3,2,1

            sinir = satir;

            for (int j = 1; j <= sinir; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
