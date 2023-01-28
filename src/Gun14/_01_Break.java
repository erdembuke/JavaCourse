package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen bir sayinin, 2 ayni sayinin carpimina esit olup olmadigini bulunuz.

        // 4 girdim (2 nin 2 ile carpimi) / 5 girdim (tam kare degil) / 9 girdim (3 ile 3 ün carpimi)

        Scanner scInt = new Scanner(System.in);
        System.out.print("Bir sayi girin -> ");
        int sayi = scInt.nextInt();
        int sayac = 0;
        boolean bulunduMu = false;

        // 5 girildi ise 5 e kadar olan sayilari carpariz 1,2,3,4
        // 9 girildi ise 9 a kadar olan sayilari carpariz 1,2,3,4,5,6,7,8 (3*3 9 u verir 3 olur)

        while (sayac < sayi)
        {
            if (sayac * sayac == sayi) {
                System.out.println("Sayi tam kare !");
                bulunduMu = true;
                break;
            }
            sayac++;
        }
        if (!bulunduMu) {
            System.out.println("tam kare degil !");
        }
    }
}
