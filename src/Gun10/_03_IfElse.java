package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

        // Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner scInt = new Scanner(System.in);
        System.out.print("Bir sayi giriniz -> ");
        int sayi = scInt.nextInt();

        if (sayi % 2 ==0) {
            System.out.println("Sayiniz cift !");
        }
        else
            System.out.println("Sayiniz tek !");







    }
}
