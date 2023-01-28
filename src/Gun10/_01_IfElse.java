package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // girilen bir ogrenci notuna gore 50 den buyuk ise geçtiniz kücük ise kaldiniz yazin

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu girin -> ");
        int ogrNot = oku.nextInt();

        // 1. (onceki) yontem

        if (ogrNot >= 50) {
            System.out.println("Gectiniz");
        }
        if (ogrNot <50) {
            System.out.println("Kaldiniz");
        }

        // 2. (yeni) olmasi gereken yontem
        if(ogrNot >= 50) {
            System.out.println("Gectiniz"); // evet
        }
        else {
            System.out.println("Kaldiniz"); // hayir
        }








    }
}
