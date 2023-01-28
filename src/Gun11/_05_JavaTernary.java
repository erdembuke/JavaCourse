package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // girilen sayinin sifir mi , negatif mi , pozitif mi oldugunu
        // ternary operatorle yazdirin
        Scanner scInt = new Scanner(System.in);
        System.out.print("sayi girin -> ");
        int sayi = scInt.nextInt();

        System.out.println(sayi == 0 ? "sifir" : (sayi>0 ? "pozitif" : "negatif"));
    }
}
