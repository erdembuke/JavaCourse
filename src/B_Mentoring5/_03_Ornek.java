package B_Mentoring5;

import java.util.*;

public class _03_Ornek {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(4);
        hs.add(20);
        hs.add(7);
        hs.add(8);
        hs.add(8);
        hs.add(5);
        hs.add(null);
        System.out.println("hs = " + hs);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(4);
        ls.add(20);
        ls.add(7);
        ls.add(6);
        ls.add(8);
        ls.add(8);
        ls.add(5);
        ls.add(null);
        System.out.println("ls = " + ls);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(20);
        ts.add(7);
        ts.add(6);
        ts.add(8);
        ts.add(8);
        ts.add(5);
        //ts.add(null); NULL un integer bir degeri olmadigi icin siralayamadi ve hata verdi.
        System.out.println("ts = " + ts);

        System.out.println();
        System.out.println("hs adli HashSet in icinde 1-10 arasindaki hangi sayilar var ?");
        for (int i = 1; i <= 10; i++) {
            if (hs.contains(i))
                System.out.println(i + " sayisi sette var");
            else System.out.println(i + " sayisi sette yok  ");
        }





    }
}
