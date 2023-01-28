package Gun07;

import java.util.Scanner;

public class _06_Ornek1 {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadin(tam ad) adini ve soyadiniz ayirip
        // ayri ayri yazdiriniz

        Scanner reader = new Scanner(System.in);
        System.out.print("Adiniz ve Soyadinizi Giriniz -> ");

        String tamIsim =  reader.nextLine();
        int bosluk = tamIsim.indexOf(" ");
        String isim = tamIsim.substring(0,bosluk);
        System.out.println("isim = " + isim);

        String soyad = tamIsim.substring(bosluk+1);
        System.out.println("soyad = " + soyad);

        // Erdem Buke
        // ad : 0,boslugun indexi
        // soyad: bosluk+1,sonuna kadr




    }
}
