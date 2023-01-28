package B_Mentoring5;

import java.util.HashSet;

public class _01_ButunDegiskenler {
    public static void main(String[] args) {
        HashSet<Object> hset = new HashSet<>();
        hset.add(2);
        hset.add("meth");
        hset.add(true);
        hset.add(5214);

        for (Object elements : hset)
            System.out.print(elements + " / ");
    }
}
