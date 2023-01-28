package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayiyi kullanicidan aldiktan sonra
        // toplama icin t cikarma icin c , carpma icin p , bolme icin b
        // harflerini alarak istege uygun olan islemi yaptirip
        // sonucu yazdirin
        // SWITCH ILE

        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.print("sayi 1 i girin -> ");
        int sayi1 = scInt.nextInt();
        System.out.print("sayi 2 yi girin -> ");
        int sayi2 = scInt.nextInt();

        System.out.print("Hangi islem yapilsin (Toplama=t) (Cikarma=c) (Carpma=p) (bolme=b) -> ");
        String istek = scStr.nextLine().toLowerCase();
        switch (istek.toLowerCase()) {
            case "t" :
                System.out.println("sonuc -> " + (sayi1 + sayi2));
                break;
            case "c" :
                System.out.println("sonuc -> " + (sayi1 - sayi2));
                break;
            case "p" :
                System.out.println("sonuc -> " + (sayi1 * sayi2));
                break;
            case "b" :
                System.out.println("sonuc -> " + (sayi1 / sayi2));
                break;
            default :
                System.out.println("Hatali giris.");
        }
    }
}
