package Gun08;

import java.util.Scanner;

public class _07_Soru2 {
    public static void main(String[] args) {
        // kullanicinin girecegi 2 sayinin birbirine
        // esit mi olup olmadigini yazdiriniz

        Scanner readerInt = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz ");
        int sayi1 = readerInt.nextInt();
        System.out.print("2. sayiyi giriniz ");
        int sayi2 = readerInt.nextInt();

        System.out.println("İki sayi esit mi -> " + (sayi1 == sayi2));







    }
}
