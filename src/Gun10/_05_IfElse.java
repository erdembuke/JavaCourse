package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunlugu 10dan büyükse ve string icinde "study"
        // kelimesi geciyorsa ekrana evet yazdirin degilse hayir yazdirin

        Scanner scStr = new Scanner(System.in);
        System.out.print("10 dan fazla harf iceren icerisinde study kelimesi gecen bir cumle girin ->");
        String cumle1 = scStr.nextLine().toLowerCase();


        if (cumle1.length() > 10 && cumle1.contains("study")) {
            System.out.println("Istenen sekilde bir cumle girdiniz !");
        } else {
            System.out.println("Cumle gereklilikleri karsilamiyor !");
        }


    }
}
