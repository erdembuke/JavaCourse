package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

        // kullanici 0 degeri girene kadar girdigi sayilarin toplamini bulun

        Scanner scInt = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        System.out.print("sayi girin -> ");
        sayi = scInt.nextInt();

        while(sayi != 0)
        {
            toplam = toplam + sayi;
            System.out.print("sayi girin -> ");
            sayi = scInt.nextInt();


        }
        System.out.println("toplam = " + toplam);



    }
}
