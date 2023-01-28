package B_Mentoring3;

import java.util.Scanner;

public class _03_ornek {
    public static void main(String[] args) {
        // 7 - hirilen 3 basamaklı bir sayinin birler onlar ve yuzler bas bulun

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi girin -> ");
        int sayi = oku.nextInt();
        int basamak;
        int sayac = 1;

        while (sayi > 0) {
            basamak = sayi % 10;
            System.out.println(sayac + " lar basamagi = " + basamak);
            sayi /= 10;
            sayac *= 10;

            //


        }
    }
}
