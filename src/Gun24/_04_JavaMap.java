package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();  // basina sadece map yazip kisaltabiliriz
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(30,"dog");
        hm.put(11,"bird");
        hm.put(4,"wolf");
        System.out.println("hm -> " + hm); // hizli calismak icin kendine gore sira


        Map<Integer, String> lhm = new LinkedHashMap<>();   // basina sadece map yazip kisaltabiliriz
        lhm.put(9,"fox");
        lhm.put(2,"cat");
        lhm.put(30,"dog");
        lhm.put(11,"bird");
        lhm.put(4,"wolf");
        System.out.println("lhm = " + lhm); // eklnedigi siraya gore


        Map<Integer,String> tm = new TreeMap<>();   // basina sadece map yazip kisaltabiliriz
        tm.put(9,"fox");
        tm.put(2,"cat");
        tm.put(30,"dog");
        tm.put(11,"bird");
        tm.put(4,"wolf");
        System.out.println("tm = " + tm);


    }
}
