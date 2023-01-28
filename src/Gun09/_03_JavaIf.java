package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // girilen iki sayidan buyuk olanin degerini ekrana yazdiriniz
        // eşit ise eşit yazdiriniz
        Scanner readInt = new Scanner(System.in);
        System.out.print("1. Sayi girin ->");
        int sayi1 = readInt.nextInt();
        System.out.print("2. Sayi girin ->");
        int sayi2 = readInt.nextInt();
        if (sayi1>sayi2) // burdaki normal parantezler sart
        { // bu parantez birden fazla emir (satir) var ise kullanılacak
            System.out.println("buyuk sayi -> " + sayi1);
        }
        if (sayi2>sayi1) {
            System.out.println("buyuk sayi -> " + sayi2);
        }
        if (sayi1 == sayi2) {
            System.out.println("Sayilar esit !");
        }

    }
}
