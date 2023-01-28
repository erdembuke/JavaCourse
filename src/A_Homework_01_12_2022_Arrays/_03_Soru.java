package A_Homework_01_12_2022_Arrays;

public class _03_Soru {
    public static void main(String[] args) {
        // 3- Int array olustur ve elemanları : 25,30,30,35,100 olsun
        // Array in elemanlari toplamini yazdir. Cevap 220 olmali.

        int[] sayilar = {25,30,30,35,100};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];

        }
        System.out.println("Sayilar dizisindeki elemanlarin toplami = " + toplam);
    }
}
