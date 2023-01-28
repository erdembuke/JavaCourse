package A_Homeworks10_11_2022_ve_24_11_2022_Arasi;

import java.util.Scanner;

public class Test_class {
    public static void main(String[] args) {
        // 7 kisilik bir sinifin notlarini giriniz ve ortalamadan büyük
        // kac not oldugunu bulunuz ve bunlari yazdirin.
        Scanner scInt = new Scanner(System.in);
        int toplam = 0;
        int[] notlar = new int[7];

        for (int i = 0; i < notlar.length ; i++) {
            System.out.print("Not girişi yapınız -> ");
            notlar[i] = scInt.nextInt();
            toplam = toplam + notlar[i];
        }
        int ortalama = (toplam / notlar.length);
        System.out.println("Not ortalaması = " + ortalama);
        int gecenSayisi = 0;

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] > ortalama) {
                System.out.println("Ortalamadan büyük olan not -> " + notlar[i]);
                gecenSayisi++;
            }
        }
        System.out.println("Ortalamadan yuksek olan not sayisi -> " + gecenSayisi);

        int deneme = 0;
        System.out.println("deneme = " + deneme);
    }
}
