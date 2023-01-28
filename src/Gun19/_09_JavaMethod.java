package Gun19;

import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // mainde Kullanicidan 5 elemanli bir diziyi doldurduktan sonra
        // dizinin en kucuk
        // en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazin
        // total 3 fonksiyon olacak.
        Scanner scInt = new Scanner(System.in);
        int[] kume = new int[5];

        for (int i = 0; i < kume.length; i++) {
            System.out.print("5 elemanli Dizinin " + i + " indexli elemanini girin -> ");
            kume[i] = scInt.nextInt();
        }
        enKucuk(kume);
        enBuyuk(kume);
        ortalamasi(kume);

    }

    public static void enKucuk(int[] dizi) {
        int enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }

        }
        System.out.println("Dizideki en kucuk sayi = " + enKucuk);
    }

    public static void enBuyuk(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        System.out.println("Dizideki en buyuk sayi = " + enBuyuk);
    }

    public static void ortalamasi(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }
        int ort = toplam / dizi.length;
        System.out.println("Dizideki elemanlarin ortalamasi = " + ort);
    }

}
