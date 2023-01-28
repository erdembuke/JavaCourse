package Gun17;

import java.util.Scanner;

public class _07_Soru_Tam_Cozum {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (10 a kadar) olarak doldurduktan sonra
        // kullanicinin girecegi bir rakamı arattiriniz
        // bu rakam var ise indexini yazdiriniz
        Scanner scInt = new Scanner(System.in);
        int[] dizi = new int[10];
        boolean bulduMu = false;

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = (int)(Math.random()*11);

        }
        System.out.print("Bilgisayar 0-10 arasi bi sayi tuttu. tahmin edin -> ");
        int tahmin = scInt.nextInt();
        for (int i = 0; i < dizi.length; i++) {
            if (tahmin == dizi[i]) {
                bulduMu = true;
                System.out.println(dizi[i] + " sayisi " + i + ". indextedir");
                break;
            }
        }
        if (!bulduMu) {
            System.out.println("Bilemediniz tekrar deneyin !");
        }

    }
}
