package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanici 0 degeri girene kadar girdigi sayilarin toplamini bulun

        Scanner scInt = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.print("sayi girin ->");
            sayi = scInt.nextInt();

            toplam = toplam + sayi;
        }while (sayi != 0);

        System.out.println("toplam = " + toplam);
    }
}
