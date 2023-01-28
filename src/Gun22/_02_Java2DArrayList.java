package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi = 5; // tek bir deger tutabilen degisken
        int[] dizi = new int[20]; // 20 deger tutabilen bir degisken , uzunluk sabit
        int[][] tablo = new int[20][2]; // 20x2 lik kadar sayi saklayabilen

        ArrayList<Integer> list = new ArrayList<>(); // istenildigi kadar sayi eklenebilen , uzunlugu degisken

        /////////////////////////////////////////////////////////////

        // bir sinif bu sinifda 20 kisi var ve bunlarin 3 dersi var. Ogrencilerin bu 3 derse ait notlarini
        // nasil bir degiskende saklayabiliriz
        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayList ' ini nasil yapariz , dizilerdeki 2d tablo gibi.
        ArrayList<ArrayList<Integer>> notlar = new ArrayList<>();
        notlar.add(matNotlari);
        notlar.add(kimNotlari);
        notlar.add(fizNotlari);

        notlar.get(0); // matNotlari
        notlar.get(1); // fizNotlari
        notlar.get(2); // kimNotlari
        int matBirNot = notlar.get(0).get(0); // mat notlarinin 0. indexi yani ilki

        System.out.println("notlarListesi = " + notlar.get(0)); // mat notlari
        System.out.println("notlarListesi = " + notlar.get(1)); // fiz not
        System.out.println("notlarListesi = " + notlar.get(2)); // kim not

        // yukardakinin yerine for dongusu nasil kullaniriz
        for (int i = 0; i < notlar.size(); i++) {
            System.out.println("notlar.get("+i+") = " + notlar.get(i));
        }

        ////// satir sutun yazdirma

        for (int i = 0; i <notlar.size() ; i++) {

            for (int j = 0; j <notlar.get(i).size() ; j++) {   // dizide notlar[i].length yaziyoduk
                System.out.print(notlar.get(i).get(j) + "\t"); // dizide [i] [j] seklinde yaziyoduk
            }
            System.out.println();
        }
        





    }
}
