package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _05_Soru {
    public static void main(String[] args) {
        // String array olusturun ve elemanlari : "new jersey","new york","boston","California"
        // Array'daki eleman sayisini yazdirin. Cevap 4 olmali
        
        String[] kelimeler = {"new jersey","new york","boston","California"};
        System.out.println("dizedeki elemanlar = " + Arrays.toString(kelimeler));
        System.out.println("dizenin eleman sayisi -> " + kelimeler.length);
    }

}
