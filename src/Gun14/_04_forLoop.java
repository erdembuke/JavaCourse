package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanicinin girecegi bir rakama kadar olan sayilarin toplamini bulun
        Scanner scInt = new Scanner(System.in);
        int i = 0;
        int t = 0;
        System.out.print("kaca kadar olan sayilarin toplamini bulsun -> ");
        int line = scInt.nextInt();


        for (i = 1; i <= line; i++) {       // i yi 1 den baslattik 0 in toplama etkisi olmadigi icin
        t = t+i;

        }
        System.out.println("toplam ->" + t);

    }
}
