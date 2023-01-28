package B_Mentoring5;

import java.util.HashMap;
import java.util.Map;

public class _05_Ornek {

    // verilen bir string de her harfin kac defa tekrar ettigini bulan bir method yaziniz (hashMap kullan)

    public static void main(String[] args) {
        String cumle = "bir berber bir berbere gel beraber bir berber dukkani acalim demis";
        String cumle2 = "Saduman Duvan dunyanin en mukemmel annesidir";
        hmapFindStringRepeat(cumle2);

    }

    public static void hmapFindStringRepeat(String a) {
        HashMap<Character, Integer> hmap = new HashMap<>();

        int repeat = 0;
        for (int i = 0; i < a.length(); i++) {

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == ' ')
                    continue;
                if (a.charAt(i) == a.charAt(j)) {
                    repeat++;
                }
            }
            if (a.charAt(i) != ' ') {
                hmap.put(a.charAt(i),(repeat-1));
            }
            repeat = 0;
        }

        for (Map.Entry<Character,Integer> kv : hmap.entrySet())
            if(kv.getValue() != 0) {
                System.out.println(kv.getKey() + " harfi " + kv.getValue() + " kere tekrar edilmistir.");
            }else System.out.println(kv.getKey() + " harfi sadece 1 adet bulunuyor ve tekrar sayisi 0");

    }

}
