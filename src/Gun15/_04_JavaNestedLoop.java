package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Asagidaki goruntuyu veren programi yazdirin ( yalnizca 1 yildiz)
        // *****        1. satir 5
        // ****         2. satir 4
        // ***          3. satir 3
        // **           4. satir 2
        // *            5. satir 1

        for (int satir = 5; satir > 0; satir--) {

            for (int j = 0; j < satir; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
