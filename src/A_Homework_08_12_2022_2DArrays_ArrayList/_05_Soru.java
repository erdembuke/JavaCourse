package A_Homework_08_12_2022_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_Soru {
    public static void main(String[] args) {
        // ismi getCount() olan bir method olusturun.
        // Parametre olarak bir String ArrayList ve bir tane String Return
        // return tipi int olmali
        // ArrayList'deki bir degerin kac kez tekrarlandigini belirtin ve dondurun
        // Ornegin ; ArrayList = Orange , Kiwi , Peach, Banana, Orange
        // String Orange :
        // Count = 2 olmali ( orange 2 kez yazilmis )
        ArrayList<String> dizi = new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        getCount(dizi,"Orange");

    }
    public static int getCount(ArrayList<String> sirali,String kelime) {
        int tekrarSayi = 0;
        for (int i = 0; i < sirali.size(); i++) {
            if (kelime.equalsIgnoreCase(sirali.get(i)))
                tekrarSayi++;
            }
        System.out.print(kelime + " kelimesinin tekrar sayisi -> " + tekrarSayi);
        return tekrarSayi;
        }
    }

