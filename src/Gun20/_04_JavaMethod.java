package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanicinin girecegi 2 sayinin toplamini
        // bir fonksiyonda buldurup , bunun sonucunu main de yazdirin.

        Scanner scInt = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int s1 = scInt.nextInt();
        System.out.print("Sayi girin -> ");
        int s2 = scInt.nextInt();

        int t = total(s1,s2);
        System.out.println("toplam -> " + t);

    }

    public static int total(int a, int b){
        return a+b;

    }
}
