package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 5 sayinin toplaminin sonucunu yazdirin

        Scanner scInt = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;

        while (sayac <5) {
            System.out.print("Sayi Giriniz -> ");
            int sayi = scInt.nextInt();
            toplam = toplam + sayi ;
            sayac++;

        }
        System.out.println("Sayilarin Toplami = " + toplam);
    }
}
