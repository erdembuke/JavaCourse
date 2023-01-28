package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // girilen bir sayiya(dahil) kadar olan sayilarin carpimini bulun
        // 2. bölüm : carpimin degeri 10000 i gectiginde islem sonlansin

        Scanner scInt = new Scanner(System.in);
        System.out.print("kaca kadar olan sayilarin carpimi bulunsun -> ");
        int sayi = scInt.nextInt();
        int i = 1;
        double carpim = 1;

        for (i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        if (carpim > 10000) {
            System.out.println("Cok yuksek bir sayi girisi yaptiniz !");
        }else System.out.println("carpim = " + carpim);


    }
}
