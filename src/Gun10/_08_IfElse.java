package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // TODO: homework for 22.11.2022 lesson - yapildi

        //yan yana aralarında bir boslukla girilen 3 int sayinin
        // toplamlarinin sonucunun tek mi cift mi oldugunu bulun

        Scanner oku = new Scanner(System.in);
        System.out.print("aralarinda 1 bosluk birakarak 3 sayi girin -> ");
        String sayilar = oku.nextLine();

        int bos1Ind = sayilar.indexOf(" ");
        int bos2Ind = sayilar.lastIndexOf(" ");

        int sayi1 = Integer.parseInt(sayilar.substring(0,bos1Ind));
        int sayi2 = Integer.parseInt(sayilar.substring(bos1Ind+1,bos2Ind));
        int sayi3 = Integer.parseInt(sayilar.substring(bos2Ind+1));

        if ((sayi1+sayi2+sayi3) % 2 == 0) {
            System.out.println("Cift !");
        }
        else {
            System.out.println("Tek");
        }






    }
}
