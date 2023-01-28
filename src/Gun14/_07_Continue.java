package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Kullanicidan 5 sayi isteyiniz.
        // bu sayilardan 6 ile 10 arasindakiler haric, digerlerini toplasin.

        Scanner scInt = new Scanner(System.in);

        int toplam = 0;
        for (int i=0; i<5; i++) {
            System.out.print("bir sayi girin -> ");
            int sayi = scInt.nextInt();

            if (sayi >= 6 && sayi <= 10)
                continue;   // 6 ve 10 arası sayi gelirse toplamayacak.

            toplam += sayi;
            System.out.println("toplam = " + toplam);
        }





    }
}
