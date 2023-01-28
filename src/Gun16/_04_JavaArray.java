package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // kullanicidan alacagimiz 7 sayiyi aldiktan sonra
        // kac tanesinin ortalamadan büyük ve tek sayi oldugunu bulun
        Scanner scInt = new Scanner(System.in);
        int[] havuz = new int[7];
        int toplam = 0;
        System.out.println("Girdiginiz 7 sayinin ortalamasindan büyük tek olan sayilari bulacagiz !");

        for (int i = 0; i < havuz.length; i++) {
            System.out.print("Sayi girin ->");
            havuz[i] = scInt.nextInt();
            toplam = toplam + havuz[i];
        }
        int ortalama = toplam / havuz.length;
        System.out.println("sayilarin ortalamasi -> " + ortalama);

        int kactane = 0;
        for (int i = 0; i < havuz.length; i++) {
            if (havuz[i] > ortalama && havuz[i] % 2 != 0) {
                System.out.println("Ortalamadan buyuk ve tek olan sayi -> " + havuz[i]);
                kactane++;
            }

        }

        if (kactane == 0)
            System.out.println("ortalamadan buyuk tek sayi bulunamadi");
        else System.out.println("kriterlere uygun " + kactane + " tane sayi bulundu");



    }
}
