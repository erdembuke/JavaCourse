package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayisi belli sonradan degistirilemez.
        int[] dizi = new int[5];    // Array 5 elemanli ve boyutu sonradan degistirilemiyor.

        // Boyutu dinamik olsun , eleman ekledikçe uzasın , sildikçe kısalsın
        // ArrayList : boyutunu basta vermene bile gerek yok , boyutu baslangicta 0
        // sen ekledikçe artar , sildikçe kısalır.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1 oldu
        isimler.add("Metin"); // uzunluk 2 oldu
        isimler.add("Emrah"); // uzunluk 3 oldu
        isimler.add("Erdem"); // uzunluk 4 oldu

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Muhammed");
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexteki elemanı degistirir
        System.out.println("isimler = " + isimler);

        boolean varMi = isimler.contains("Metin");
        System.out.println("varMi = " + varMi);

        isimler.remove("Metin"); // degere gore siler (Büyük kücük harf duyarli , birden fazla varsa ilkini siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiginde index kabul eder ve ona gore siler
        System.out.println("isimler = " + isimler);

        int indexOfErdem = isimler.indexOf("Erdem");
        System.out.println("indexOfErdem = " + indexOfErdem);

        String ilkEleman = isimler.get(0);  // verilen index'deki degeri verir.

        isimler.clear();    // her şeyi temizliyor
        System.out.println("isimler = " + isimler);
    }
}
