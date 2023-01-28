package A_Homework_01_12_2022_Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        // int array olusturun ve elemanlari : 12,14,21,23,10,4 olsun
        // array in ortalamasini aliniz

        int[] sayilar7 = {12, 14, 21, 23, 10, 4};
        int toplam = 0;

        for (int i = 0; i < sayilar7.length; i++) {
            toplam = toplam + sayilar7[i];
        }
        int ortalama = toplam / sayilar7.length;
        System.out.println("dizedeki sayilarin ortalamasi = " + ortalama);
    }
}
