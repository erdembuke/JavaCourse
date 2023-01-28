package T_Denemeler;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Gun23Sorusu {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random doldurduktan sonra (10 dahil a kadar)
        // 1- ) tekrarlı elemanları almayacak sekilde yeni bir diziye atın.

        Integer[] dizi = new Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*10);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            hs1.add(dizi[i]);
        }
        System.out.println("dizinin elemanlarinin tekrarlanmamis hali = " + hs1);

        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 (Arrays.asList) = " + hs2);

        HashSet<Integer> hs3 = new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3 (addAll) = " + hs3);
    }
}
