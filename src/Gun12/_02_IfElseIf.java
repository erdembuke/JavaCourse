package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayiyi kullanicidan aldiktan sonra
        // toplama icin t cikarma icin c , carpma icin p , bolme icin b
        // harflerini alarak istege uygun olan islemi yaptirip
        // sonucu yazdirin

        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.print("sayi 1 i girin -> ");
        int sayi1 = scInt.nextInt();
        System.out.print("sayi 2 yi girin -> ");
        int sayi2 = scInt.nextInt();

        System.out.print("Hangi islem yapilsin (Toplama=t) (Cikarma=c) (Carpma=p) (bolme=b) -> ");
        String istek = scStr.nextLine().toLowerCase();

        // merdivenli if , ladder if

        if (istek.equals("t")) {
            System.out.println("islem sonucu -> " + (sayi1 + sayi2));
        } else {
            if (istek.equals("c")) {
                System.out.println("islem sonucu -> " + (sayi1 - sayi2));
            } else if (istek.equals("p")) {
                System.out.print("islem sonucu -> " + (sayi1 * sayi2));
            } else if (istek.equals("b")) {
                System.out.println("islem sonucu -> " + (sayi1 / sayi2));
            } else
                System.out.println("geçerli harf girmediniz !");
        }


    }
}
