package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubun bir elemani
        // Array i siralarken Arrays.sort u kullandigimiz gibi,
        // ArrayList i Collection metodlarini kullanacagiz

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // Siralama islemi
        Collections.sort(sayilar);
        System.out.println("Siralanmis sayilar = " + sayilar);

        // Tersine çevir.
        Collections.reverse(sayilar);
        System.out.println("ters cevrilmis sayilar = " + sayilar);

        // Max ve min eleman bulma
        System.out.println("Max number is = " + Collections.max(sayilar));
        System.out.println("Min number is = " + Collections.min(sayilar));

        // Butun elemanlari set etme
        Collections.fill(sayilar,0);
        System.out.println("set edilmis sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("degistirilmis sayilar = " + sayilar);

        // tanimlarken deger atama
        int[] dizi = {2,3,4,5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,4,5,6)); // 0-1-2-3 indexlerini atadik olustururken
        liste.add(4,77); // 4. index e 77 yi atar
        System.out.println("liste = " + liste);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ahmet","mehmet","busra","roman"));
        System.out.println("strList = " + strList);


        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2,3,4,5,6,7);

        // diziyi direkt ArrayList e nasil atarim
        Integer[] dizi2 = {2,3,4,5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);

        // int sadece sayi saklayabilen basit tip.
        // Integer hem sayi sakliyor hem de kendi özgü metodlari var.





    }
}
