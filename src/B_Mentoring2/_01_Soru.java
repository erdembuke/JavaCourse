package B_Mentoring2;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // girilen bir sayinin haftanin hangi gunune denk geldigini yazdiran bir program yaz.
        Scanner scInt = new Scanner(System.in);
        System.out.print("1 den 7 ye kadar bir sayi girin -> ");
        int gunNo = scInt.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatali sayi girdiniz !");
        }
    }
}
