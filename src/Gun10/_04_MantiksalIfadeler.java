package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantiksal ifadeler
        // && ve işareti (shift+6)
        // || veya işareti (altgr + <)

        // girilen sayi pozitif ve tek ise,ekrana uygun sayi girildi degilse girilmedi yazdirin

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi -> ");
        int sayi = oku.nextInt();

        if (sayi > 0 && sayi % 2 == 1) {
            System.out.println("Uygun sayi girildi");
        } else {
            System.out.println("Uygun sayi girilmedi");
        }


    }
}
