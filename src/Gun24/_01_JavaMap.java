package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // set -> HashSet,LinkedHashSet,TreeSet
        // map -> HashMap,LinkedHashMap,TreeMap
        // Map = Anahtar + set -> Anahtarli set

        // Anahtar tipi Integer , degerinin tipi String olsun.
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "ismet temur");
        hm.put(1002, "cihat yilmaz");
        hm.put(2001, "talip yildiz");
        hm.put(5001, "eyupcan bilgin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(1002) = " + hm.get(1002));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(5001);
        System.out.println("hm = " + hm); // 5001 gitti eyupcan bilgin gitti.

        System.out.println("hm.size() = " + hm.size());

        hm.clear();  // bosaltiyor
        System.out.println("hm = " + hm);
    }
}
