package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Soru : Girilen bir ogrencinin notuna gore 50 den buyuk-esit
        //        ise gectiniz kucuk ise kaldiniz yazdiriniz
        Scanner readInt = new Scanner(System.in);
        System.out.print("Notunuzu girin -> ");
        int not = readInt.nextInt();
        if (not >= 50) {
            System.out.println("Tebrikler Gectiniz! ");
        }
        if (not < 50) {
            System.out.println("Maalesef Kaldiniz..");
        }
        if (not < 0) {
            System.out.println("Gecersiz Not !");
        }
        if (not > 100) {
            System.out.println("Gecersiz Not !");
        }


    }
}
