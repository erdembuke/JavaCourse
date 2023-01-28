package B_Mentoring5;

import java.util.HashMap;
import java.util.Map;

public class _04_Ornek {
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        // list'lerde index var
        // set'lerde index yok (tekrarlanamıyo cunku)
        // KEY ==> index  VALUE ==> degeri  (MAP'Lerde)

        int a = 1;
            a = 2;

            hmap.put("Key1","Value2");
            hmap.put("Key2","Value2");

        System.out.println("hmap = " + hmap);
        System.out.println("hmap = " + hmap.size());

        hmap.get("Key1");

        System.out.println(hmap.get("Key1"));

        for (Map.Entry<String,String> av : hmap.entrySet()) {
            System.out.println(av.getKey() + " - " + av.getValue());
        }

    }
}
