package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // girilen bir sayinin birler basamaginin degerini yazi ile yazdiriniz

        // 234 -> birler basamagi -> 4

        Scanner scInt = new Scanner(System.in);
        System.out.print("Bir sayi giriniz -> ");
        int sayi = scInt.nextInt();

        int birlerBas = (sayi % 10);    // 234 ise 4 ü verir

        switch (birlerBas) {
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }


    }
}
