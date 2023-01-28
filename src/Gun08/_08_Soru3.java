package Gun08;

import java.util.Scanner;

public class _08_Soru3 {
    public static void main(String[] args) {
        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz
        Scanner readerInt = new Scanner(System.in);
        System.out.print("sayi giriniz -> ");

        int sayi = readerInt.nextInt();
        int kalan = sayi % 2;                   // bu 1 e esitse tek sayidir

        System.out.println("Sayi tek sayi mi -> " + (kalan == 1));

        //2. yontem
        System.out.println("(sayi%2 == 1) = " + (sayi % 2 == 1));

        // 3. yontem (negatif de girilebilcegi icin en dogru cozum)
        System.out.println("(sayi % 2 != 0) = " + (sayi % 2 != 0));
    }
}
