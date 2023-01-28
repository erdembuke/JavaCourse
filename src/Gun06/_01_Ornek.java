package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner readerSt = new Scanner(System.in);
        Scanner readerInt = new Scanner(System.in);

        System.out.print("Cadde giriniz ");
        String cadde = readerSt.nextLine();

        System.out.print("Sokak Giriniz ");
        String sokak = readerSt.nextLine();

        System.out.print("Posta Kodu Giriniz ");
        int postaKodu = readerInt.nextInt();

        System.out.print("Ulke Giriniz ");
        String ulke = readerSt.nextLine();

        System.out.println("Adresiniz " + cadde + " " + sokak + " " + postaKodu + " " + ulke);



    }
}
