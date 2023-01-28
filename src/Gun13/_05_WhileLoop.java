package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayilarin toplamini bulunuz
        int sayac = 1;
        int toplam = 0;

        while (sayac <= 100) {
            toplam = toplam + sayac;
            sayac++;

        }
        System.out.println("0 dan 100 e kadar olan sayilarin toplami = " + toplam);
    }
}
