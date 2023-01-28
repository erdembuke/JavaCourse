package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _13_Soru {
    public static void main(String[] args) {
        // Bu sekilde string olusturun : "$12 $23 $10 $2 $5 $2"
        // $ işaretlerini kaldirin ve sayilari toplayin
        String cumle13 = "$12 $23 $10 $2 $5 $2";
        int toplam = 0;
        String yeni = cumle13.replace("$", "");
        System.out.println("yeni = " + yeni);
        String[] sayilar = yeni.split(" ");
        System.out.println("sayilar = " + Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {
            toplam = Integer.parseInt(sayilar[i]) + toplam;

        }
        System.out.println("sayilar toplami = " + toplam);


    }
}
