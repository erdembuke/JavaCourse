package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Soru : girilen sayi 50 den buyuk ise 1 , degilse 0 degerini ekrana yazin
        // Ternary operator ile yapiniz
        Scanner scInt = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int sayi = scInt.nextInt();

        //1.
        int sonuc =(sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);

        //2.
        System.out.println((sayi>50) ? 1 : 0);
    }
}
