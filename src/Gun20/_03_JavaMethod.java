package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanicinin girecegi bir sayiya kadar olan sayilarin carpimini (faktoriyel)
        // bir fonksiyonda buldurup bunun sonucunu mainde tek mi cift mi oldugunu yazdirin
        Scanner scInt = new Scanner(System.in);
        System.out.println("Gireceginiz sayiya kadar olan sayilarin carpimini bulacagiz");
        System.out.print("Sayi girin -> ");
        int s1 = scInt.nextInt();
        int carpim = Until(s1);
        System.out.println("girdiginiz sayiya kadar olan sayilarin carpimi -> " + carpim);

        System.out.println(carpim % 2 == 0 ? "Carpim sonucu cift sayi" : "Carpim sonucu tek sayi");

    }

    public static int Until (int s1) {
        int c = 1;
        for (int i = 1; i < s1; i++) {
            c *= i;
        }
        return c;
    }
}
