package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz
        // bu gun hava cok guzel -> 5.

        Scanner scStr = new Scanner(System.in);
        System.out.print("Bir cumle yazin icinde kac kelime oldugunu bulalim -> ");
        String cumle = scStr.nextLine();

        int boslukSayi = 0;
        for (int i = 0; i < cumle.length() ; i++) {
            if (cumle.charAt(i) == ' ') {
                boslukSayi++;
            }
        }
        System.out.println("Kelime sayisi -> " + (boslukSayi+1));

    }
}
