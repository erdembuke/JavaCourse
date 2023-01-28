package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // asagidaki goruntuyu veren programi yazin (sadece 1 yildiz ile yapin
        // *        1. satir 1 yildiz
        // **       2. satir 2 yildiz
        // ***      3. satir 3 yildiz
        // ****     4. satir 4 yildiz
        // *****    5. satir 5 yildiz


        for (int satir = 1; satir <= 5; satir++) {  // 1,2,3,4,5 , ( satir = 3)

            for (int yildiz = 1; yildiz <= satir; yildiz++) { // satir sayisi kadar yildiz olmali (satir 3 , yildiz 3)
                System.out.print("*");
            }
            System.out.println();   // alt satira gecmesi icin kullandik , üstte print oldugu icin bunu koymazsak yildizlari yan yana yazar

        }

    }
}
