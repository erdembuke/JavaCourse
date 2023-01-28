package Gun23;

import java.util.Arrays;
import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(4,5,6,7));

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        // birlestirme ( ayni olanlari silecek SET yapisindan dolayi )
        HashSet<Integer> birlesikHali = new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        // farkini alma

        HashSet<Integer> farki = new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);
        System.out.println("farki = " + farki);
        // a nin b den farkini aldik


        // kesisimleri

        HashSet<Integer> ortakElemanlar = new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);

    }
}
