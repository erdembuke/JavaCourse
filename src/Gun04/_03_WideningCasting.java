package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;

        oran = sayi; // kayip yok oran=9
        System.out.println("oran = " + oran);

        toplam = sayi; // kayip yok 9 oldu
        System.out.println("toplam = " + toplam);

        oran = toplam; // oran 9 oldu
        System.out.println("oran = " + oran);


    }
}
