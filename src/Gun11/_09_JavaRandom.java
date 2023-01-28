package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisin
        // kullanici bilirse tebrikler yazdirin

        Scanner scInt = new Scanner(System.in);
        System.out.print("Bilgisayar sayiyi kaca kadar tutsun ? ");
        int sinir = scInt.nextInt();

        int tutulanSayi = (int)(Math.random() * sinir);

        System.out.print("Tahmininiz -> ");
        int tahmin = scInt.nextInt();

        if (tahmin == tutulanSayi) {
            System.out.println("Helel len yusufi");
        }
        else {
            System.out.println("B A Ş A R A M A D I N");
        }
    }
}
