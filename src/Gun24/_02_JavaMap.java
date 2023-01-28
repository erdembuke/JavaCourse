package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        // Key ve Value ' leri yazdirmak.

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "ismet temur");
        hm.put(1002, "cihat yilmaz");
        hm.put(2001, "talip yildiz");
        hm.put(5001, "eyupcan bilgin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k : hm.keySet())
            System.out.print(k + "\t");

        System.out.println();

        for (String eleman : hm.values())
            System.out.print(eleman + "\t");

        System.out.println();

        for (Map.Entry<Integer,String> kv : hm.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue());

        }

        }
    }

