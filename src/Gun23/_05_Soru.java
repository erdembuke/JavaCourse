package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random doldurduktan sonra (10 dahil a kadar)
        // 1- ) tekrarlı elemanları almayacak sekilde yeni bir diziye atın.
        Integer[] dizi = new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*10);

        }
        Arrays.sort(dizi);
        System.out.println("Dizideki elemanlar -> " + Arrays.toString(dizi));

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            hs.add(dizi[i]);
        }
        System.out.println("Dizideki elemanların tekrar edenlerinin silinmis hali = " + hs);

        // 2. yontem

        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(dizi));
        System.out.println("Dizideki elemanların tekrar edenlerinin silinmis hali (Arrays.asList) = " + hs2);

        // 3. yontem
        HashSet<Integer> hs3 = new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("Dizideki elemanların tekrar edenlerinin silinmis hali (Collections.addAll) = " + hs3);




    }
}
