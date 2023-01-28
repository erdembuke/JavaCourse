package Gun23;

import java.util.*;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet : hizli , bunun icin kendine gore algoritmik siralada tutar
        // LinkedHastSet : EKLEME sirasina gore siralar.
        // TreeSet : her zaman icinde sirali sekilde tutar, kendinden sort lu

        HashSet<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println("hs = " + hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        lhs.add("five");
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        ts.add("five");
        System.out.println("ts = " + ts);

        // run and see the differences between SET's.
    }
}
