package Gun15;

public class _05_JavaNestedLoop {
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

        for (int satir = 1; satir <= 5; satir++) {

            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");
            }
            System.out.println();   // alt satira gecmesi icin kullandik , üstte print oldugu icin bunu koymazsak yildizlari yan yana yazar

        }

        // üst taraf 1 yildizdan 5 yildiza kadar yaziyor , alt taraf 5 yildizdan 1 yildiza kadar yaziyor

        for (int satir = 5; satir > 0; satir--) {

            for (int j = 1; j <= satir; j++) { // 5,4,3,2,1
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
