package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma sihirbazı");
        System.out.print("Yeni sifreniz -> ");
        String newPassword = oku.nextLine();

        if (newPassword.length() < 8) {
            System.out.println("Yeni şifreniz 8 karakterden küçük olamaz");
            // log tutma
        }

        if (newPassword.length() > 15) {
            System.out.println("Yeni şifreniz 15 karakterden büyük olamaz");
            // log tutma
        }
    }
}
