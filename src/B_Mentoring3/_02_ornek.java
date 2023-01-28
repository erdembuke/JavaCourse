package B_Mentoring3;

import java.util.Scanner;

public class _02_ornek {
    public static void main(String[] args) {
        // Girilen bir email in uygun formatta olup olmadigini belirten bir program yaziniz.
        /*

        Girilen email icin uygunluk kosullari

        1- Email ".com" ile bitmeli                              techno@study.com
        2- Email "@" işareti bulundurmali                        techno@study.com
        3- "@" işareti ".com" dan once olmali                    techno@study.com
        4- "@" işareti öncesinde en az 1 karakter olmali         techno@study.com
        5- "@" ile ".com" arasinda en az 1 karakter olmali.      techno@study.com

         */

        Scanner scInt = new Scanner(System.in);
        System.out.println("E mail simülatörüne hoşgeldiniz. Kurallar :");
        System.out.println(".com ile bitmeli\n@ isareti bulundurmali\n@ isareti .com dan once olmali\n@ oncesinde en az 1 karakter olmali\n@ ile .com arasinda en az 1 karakter olmali");
        System.out.println("E-mail adresinizi girin ->");
        String email = scInt.nextLine();

        if (email.endsWith(".com")
                && email.contains("@")
                && email.indexOf("@") < email.indexOf(".com")
                && !email.substring(0,email.indexOf("@")).isEmpty()
                && email.substring(email.indexOf("@"),email.indexOf(".com")).length() >= 1) {
            System.out.println("helel len yusufi");
        }else System.out.println("BOYLE MAIL MI OLUR");
    }
}
