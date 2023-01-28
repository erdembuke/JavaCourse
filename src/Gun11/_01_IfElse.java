package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayini pozitif , negatif veya sifir oldugunu yazdiriniz.

        Scanner scInt = new Scanner(System.in);
        System.out.print("Sayi giriniz -> ");
        int sayi = scInt.nextInt();

        if (sayi > 0){
            System.out.println("Pozitif");
        }
        else {

            if (sayi < 0)
                System.out.println("Negatif");
            else
                System.out.println("Sifir");

        }
        //////////////////////////////////////////////
        if (sayi > 0)
            System.out.println("pozitif");
        if (sayi < 0)
            System.out.println("negatif");
        if (sayi == 0)
            System.out.println("sifir");
    }
}
