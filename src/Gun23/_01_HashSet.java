package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        /*

        BU ZAMANA KADAR NELER OGRENDIK

        int sayi = 5;   // hafizada 1 sayi saklar
        int[] dizi = new int[6]; // hafizada 6 sayi saklar
        int[][] tablo = new int[3][20]; // hafizada 3x20 seklinde 60 deger tutar

        // dizi lazim ama boyutu ekledikce artsin sildikce azalsin
        ArrayList<Integer> list = new ArrayList<>();    // boyu degisken
        ArrayList<ArrayList<Integer>> grades = new ArrayList<>();

        */

        /*
         Java , su ana kadar verdigin degisken tipleri icin tesekkurler, fakat bana öyle bir dizi ver ki
         hem ArrayList gibi olsun hem de TEKRAR degerleri içine almasin. öyle bir set , yani dizi tipi ver bana

         Java : sevgili erdem , hic canini sikma bu is icin tasarlanmis SET ler adini verdigimiz dizilerimiz var.

         // 1-) HashSet : sen ekledikce hizli calismak icin kendine gore bir siralamada elemanlari tutar.
         // 2-) LinkedHashSet : sen ekledikce , ekleme sirana gore elemanlarini saklar.
         // 3-) TreeSet : sen ekledikce onlari her zaman sirali tutar.

         bunlarin ortak ozelligi hic TEKRARLANAN deger almaz.
        */

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi = hs1.add(5);
        boolean terarEklendiMi = hs1.add(5);
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("terarEklendiMi = " + terarEklendiMi);
        System.out.println("hs1 = " + hs1);






    }
}
