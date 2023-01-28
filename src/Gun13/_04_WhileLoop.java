package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // girilen 20 sayidan sadece pozitif olanlarin
        // toplamini bulun

        Scanner scInt = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;

        while(sayac < 20) {
            System.out.print("Sayi girin ->");
            int sayi = scInt.nextInt();
            if (sayi > 0)
                toplam = toplam + sayi;

            sayac++;

        }
        System.out.println("Pozitif olanlarin toplami -> " + toplam);
    }
}
