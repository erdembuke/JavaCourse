package A_Homework_01_12_2022_Arrays;

public class _08_Soru {
    public static void main(String[] args) {
        // int array olusturun ve elemanlari : 5,6,8,12,14,19
        // eger sayi ciftse topla tekse cikar
        // Ornegin -5+6+8+12+14-19 == 16
        // toplamlari yazdirin

        int[] sayilar8 = {5,6,8,12,14,19};
        int toplam = 0;

        for (int i = 0; i < sayilar8.length; i++) {
            if (sayilar8[i] % 2 == 0) {
                toplam = toplam + sayilar8[i];
            }else toplam = toplam - sayilar8[i];

        }
        System.out.println("toplam = " + toplam);

    }
}
