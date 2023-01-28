package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
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
        notlar.add(fizNotlari);
        notlar.add(kimNotlari);

        // Soru 1
        // Notlari ekrana ders adlarini bir ArrayList ten alarak her dersin adini ve notlarini
        // her bir satira yazdirin
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");


        for (int i = 0; i < notlar.size(); i++) {
            System.out.print(dersler.get(i) + " Notlari -> ");
            for (int j = 0; j < notlar.get(i).size(); j++) {
                System.out.print(notlar.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanicidan istedigi bir dersin no sunu alarak (0-Mat , 1-Fiz , 2-Kim)
        // sadece istedigi derse ait notları bir metodda yazdirin
        System.out.println("*********************************");

        Scanner scInt = new Scanner(System.in);
        System.out.print("Notlarini gormek istediginiz dersi yazin (0-Mat , 1-Fiz , 2-Kim) -> ");
        int secim = scInt.nextInt();

        if (secim == 0)
            System.out.print("Matematik notlari -> ");
        else if (secim == 1)
            System.out.print("Fizik Notlari -> ");
        else if (secim == 2)
            System.out.print("Kimya Notlari -> ");

        dersNotlariniYazdir(notlar,secim);

        // Yukarida verilen derse ait not ortalamasini ve geçen sayisini bir metodda yazdiriniz.
        dersOrtVeGecenMikBul(notlar,secim);


    }
    public static void dersOrtVeGecenMikBul(ArrayList<ArrayList<Integer>> notlar, int dersNo) {

        int toplam= 0;
        for (int i = 0; i < notlar.get(dersNo).size(); i++) {
            toplam += notlar.get(dersNo).get(i);
        }

        int ort = toplam / notlar.get(dersNo).size();

        int gecenMik = 0;
        for (int i = 0; i < notlar.get(dersNo).size(); i++) {
            if (notlar.get(dersNo).get(i) >= ort)
                gecenMik++;
        }
        System.out.println();
        System.out.println("ort = " + ort);
        System.out.println("Gecenler = " + gecenMik);
    }




    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi , int dersNo) {
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i) + "\t");
        }
    }

}
