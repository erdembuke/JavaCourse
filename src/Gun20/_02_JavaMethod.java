package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // kullanici girecegi iki sayidan büyük olanini bulma islemini bir metodda yaptiktan sonra
        // mainde yazdiriniz.

        Scanner scInt = new Scanner(System.in);
        System.out.print("Sayi girin ->");
        int s1 = scInt.nextInt();
        System.out.print("Sayi girin ->");
        int s2 = scInt.nextInt();

        int enBuyuk = fMax(s1, s2);
        System.out.println("Buyuk sayi = " + enBuyuk);


    }

    public static int fMax(int a, int b) {
        /*

        int max = 0;
        if (a > b)
            max = a;
        else
            max = b;

        return max;

        */

        // 2. yöntem
        // return a > b ? a : b;

        // 3. yontem
        if (a > b)
            return a;
        else
            return b;

    }
}
