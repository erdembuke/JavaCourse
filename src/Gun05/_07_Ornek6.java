package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdörtgenin uzun ve kisa kenarini isteyip alanini cevresini bulun , ekrana yazdirin
        // cevre = a + b + a + b  //  alan = a * b

        Scanner oku = new Scanner(System.in);

        System.out.print("Dikdortgenin kisa kenarini giriniz = ");
        int kisaKenar = oku.nextInt();

        System.out.print("Dikdortgenin uzun kenarini giriniz = ");
        int uzunKenar = oku.nextInt();

        int cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        int alan = kisaKenar * uzunKenar;

        System.out.println("Dikdortgenin cevresi = " + cevre);
        System.out.println("Dikdortgenin alani = " + alan);
    }
}
