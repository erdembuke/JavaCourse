package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Soru : girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz
        // sifir ise sifir yazdiriniz

        Scanner readerInt = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int sayi = readerInt.nextInt();
        if (sayi > 0)
        {
            System.out.println("Sayi Pozitif !");
        }
        if (sayi < 0)
        {
            System.out.println("Sayi Negatif !");
        }
        if (sayi == 0)
        {
            System.out.println("Sayi sifir !");
        }

    }
}
