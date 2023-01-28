package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // girilen bir ay numarasina gore ayin kac gun surdugunu yazdirin

        Scanner scInt = new Scanner(System.in);
        System.out.print("Bir ay Numarası girin (6) gibi - >");
        int ayNo = scInt.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;

            case 2:
                System.out.println(28);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("hatali ay no");
        }







        /* eskiden normalde asagidaki gibi cozerdik

        switch (ayNo) {
            case 1:
                System.out.println("Ocak -> 31 gün içerir");
                break;
            case 2:
                System.out.println("Şubat -> 28 gün içerir");
                break;
            case 3:
                System.out.println("Mart -> 31 gün içerir");
                break;
            case 4:
                System.out.println("Nisan -> 30 gün içerir");
                break;
            case 5:
                System.out.println("Mayıs -> 31 gün içerir");
                break;
            case 6:
                System.out.println("Haziran -> 30 gün içerir");
                break;
            case 7:
                System.out.println("Temmuz -> 31 gün içerir");
                break;
            case 8:
                System.out.println("Agustos -> 31 gün içerir");
                break;
            case 9:
                System.out.println("Eylül -> 30 gün içerir");
                break;
            case 10:
                System.out.println("Ekim -> 31 gün içerir");
                break;
            case 11:
                System.out.println("Kasım -> 30 gün içerir");
                break;
            case 12:
                System.out.println("Aralık -> 31 gün içerir");
                break;
            default:
                System.out.println("Geçersiz numara girişi !");

         */


    }
}
