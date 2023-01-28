package Gun06;

import java.util.Scanner;

public class _06_Soru2 {
    public static void main(String[] args) {
        //Girilen bir adi soyadi "Erdem Buke" yi E.B. seklinde yazdiriniz
        Scanner readerSt = new Scanner(System.in);

        System.out.print("Adinizi Soyadinizi Giriniz ");
        String isim = readerSt.nextLine();
        char ad1 = isim.charAt(0);

        // bosluktan sonraki ilk harfi yazdiracagiz
        int boslukIndex = isim.indexOf(" ");
        char soyad2 = isim.charAt(boslukIndex + 1);
        System.out.println("Baş Harfleriniz = " + ad1 + "." + soyad2 + ".");

        // char soyad2 = isim.charAt(adsoyad.indexOf(" ")+1);


    }
}
