package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arasi gibi sayilar urettik, hep 0 dan basliyor
        // 4-9 arasi nasıl yapilir ?
        // Yöntem şu : önce aralık kadar normal üret (9-4) yani 0-5 arasi
        // uretilmis olan sayiya min sayiyi ekle , üretilmis sayi +4
        // (int)(Math.random()*(max-min))+min

        // Girilen max ve min araliginda random sayi urettirin
        Scanner oku = new Scanner(System.in);
        System.out.print("min ->");
        int min = oku.nextInt();

        System.out.print("max ->");
        int max = oku.nextInt();

        int rndSayi = (int)(Math.random()*(max-min))+min;
        System.out.println("rndSayi = " + rndSayi);


    }
}
