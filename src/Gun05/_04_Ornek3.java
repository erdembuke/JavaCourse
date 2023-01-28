package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanicidan adini ve soyadini ayri ayri okutarak alip birlikte ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);  // ***TEK SCANNER YETERLI AD VE SOYAD ICIN AYRI YAPMAYA GEREK YOK.***

        System.out.print("Adinizi Giriniz ");

        String Adiniz = oku.nextLine();


        System.out.print("Soyadinizi Giriniz ");

        String Soyadiniz = oku.nextLine();

        System.out.println("Adiniz = " + Adiniz);
        System.out.println("Soyadiniz = " + Soyadiniz);
        System.out.println("Adiniz ve Soyadiniz = " + Adiniz + " " + Soyadiniz);


    }
}
