package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz
        Scanner sayioku = new Scanner(System.in);
        System.out.print("Birinci Sayi ");
        int sayi1 = sayioku.nextInt();

        System.out.print("Ikinci Sayi ");
        int sayi2 = sayioku.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println("Sayilarin Toplami = " + toplam);


    }
}
