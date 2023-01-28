package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma sihirbazı");
        System.out.print("Yeni sifreniz -> ");
        String newPassword = oku.nextLine();

        try {
            if (newPassword.length() < 8) // bu mesaj ile suni hata olusturur
                System.out.println("Şifre en az 8 karakterden olusmali");

            if (newPassword.length() > 15) // bu mesaj ile suni hata olusturur
                System.out.println("Şifre en fazla 15 karakterden olusmali");
        }catch (Exception ex) {
            // hatalar bir yere toplanip hepsi icin yapilmasi gereken islemler
            // bir arada burda yapilabilir, mesela log tutma gibi.
            System.out.println("Lutfen dikkat !");
            System.out.println(ex.getMessage());
            // log tutma
        }

    }
}
