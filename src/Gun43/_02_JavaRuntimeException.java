package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        try{
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi1 = ");
        int sayi1 = scan.nextInt();

        System.out.print("Sayi2 = ");
        int sayi2 = scan.nextInt();

        int bolum = (sayi1 / sayi2);
        System.out.print("Bolum = " + bolum);
    }catch(Exception hata)
        // hata mesajlarını hata isimli Exception cinsinden degiskene attim.
        {
            System.out.println("hata = " + hata.getMessage());
            System.out.println("Lütfen tekrar deneyiniz");
        }

        System.out.println("Program bitti");

    }
}
