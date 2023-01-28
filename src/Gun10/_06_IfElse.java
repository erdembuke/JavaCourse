package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // girilen yeni bir passwordun kurallara uygunlugunu kontrol ettirin
        // kurallar :
        // 1) en az 8 karakter olmali
        // 2) icinde pass kelimesi olmamali
        // 3) en fazla 12 karakter olmali

        Scanner scStr = new Scanner(System.in);
        System.out.print("En az 8 , en fazla 12 haneli sifre giriniz -> ");
        String sifre = scStr.nextLine();

        if (sifre.length() >= 8 && sifre.length() <= 12 && !sifre.toLowerCase().contains("pass")) {
            System.out.println("Sifreniz geçerli !");
        }
        else{
            System.out.println("Sifreniz gecersiz !");
        }
        if (sifre.contains("pass")) {
            System.out.println("Sifre pass kelimesi icermemelidir!");
        }
        // 2. yontem

        boolean varMi=sifre.toLowerCase().contains("pass");
        if (sifre.length() >= 8 && sifre.length() <=12 && !varMi)  // !varMi
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");

        // 3. yontem

        if (sifre.length() >= 8 && sifre.length() <=12 && sifre.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");


    }
}
