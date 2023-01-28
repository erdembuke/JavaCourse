package B_Mentoring3;

import java.util.Scanner;

public class _01_ornek {
    public static void main(String[] args) {

        // ornek soru : girilen bir sayinin pozitif olup olmadigini , pozitifse cift sayi olup olmadigini yazdirin.
        // TERNARY İLE YAP.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int sayi = sc.nextInt();

        System.out.println(sayi >= 0 ? (sayi % 2 == 0 ? "pozitif cift sayi" : "pozitif tek") : (sayi % 2 !=0 ? "negatif tek" : "negatif cift") );

        // 2. yontem

        if (sayi > 0) {
            System.out.println("Pozitif");
            if (sayi % 2 == 0) {
                System.out.print("çift");
            }else System.out.print("tek");

        }else {
            System.out.println("negatif");
            if (sayi % 2 == 0)
                System.out.print("çift");
            else System.out.print("tek");
        }

    }
}
