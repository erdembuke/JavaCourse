package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Soru :  kullanicinin iki kez girecegi sifresinin ayni oldugunu
        //         ayni veya degil seklinde cevaplayin
        Scanner readStr = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz -> ");
        String sifre1 = readStr.nextLine();

        System.out.print("Yeniden sifrenizi giriniz -> ");
        String sifre2 = readStr.nextLine();

        boolean ayniMi = sifre1.equals(sifre2);

        if (ayniMi) {
            System.out.println("Sifre ayni");
        }
        if (!ayniMi) {
            System.out.println("Sifre farkli");
        }
        // 2. yontem
        if (sifre1.equals(sifre2)) {
            System.out.println("sifre ayni");
        }
        if (!sifre1.equals(sifre2)) {
            System.out.println("sifre farkli");
        }
    }
}
