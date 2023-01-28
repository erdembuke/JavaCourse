package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);
        tekMiCiftMi(31);

        // Kullanicidan sayi alarak onun tek mi cift mi oldugunu bulalim
        tekMiCiftMiOku();


    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0)
            System.out.println(sayi + " sayisi cift sayidir");
        else System.out.println(sayi + " sayisi tek sayidir");
    }

    public static void tekMiCiftMiOku() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz -> ");
        int sayi = oku.nextInt();

        tekMiCiftMi(sayi);
    }

}
