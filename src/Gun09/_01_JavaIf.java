package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimimiz -> if demek
        // Girilen bir sayi 10 dan buyuk ise ekrana 10 dan buyuk yazdiriniz.
        // Algoritma da
        // 1- basla
        // 2 - sayi oku int sayi = oku.nextInt()
        // 3 - sayi >10 ise "10 dan buyuk" yaz -> if (sayi > 10) sout....
        // 4 - dur

        Scanner read = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int sayi = read.nextInt();

        if (sayi > 10)
        { // if sarti saglandiginda yapilcaklar parantezi
            System.out.println("10 dan buyuk");
            System.out.println("if in icinde birden fazla komut var ise if parantezleri sarttir");

        }

    }
}
