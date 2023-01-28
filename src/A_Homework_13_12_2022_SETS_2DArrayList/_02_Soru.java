package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _02_Soru {
    public static void main(String[] args) {
        /**
        changeSet() isminde bir method oluşturun.
        Parametre olarak bir String HashSet   ve  iki String
        return hashset olmalı
        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        **ÖRNEK:**
        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        String 1 = **banana**
        String 2 = **peach**
        **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
         */
        HashSet<String> hset = new HashSet<>(Arrays.asList("banana","strawberry","kiwi","pineapple"));
        System.out.println("hset = " + hset);
        System.out.println("changed hset = " + changeSet(hset,"banana","peach"));

    }
    public static HashSet<String> changeSet(HashSet<String> hset, String a, String b) {
        Iterator<String> gosterge = hset.iterator();
        ArrayList<String> words = new ArrayList<>();
        HashSet<String> hsetChanged = new HashSet<>();

        for (int i = 0; i < hset.size(); i++) {
            words.add(gosterge.next());
        }
        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).equals(a))
                hsetChanged.add(b);
            else hsetChanged.add(words.get(i));
        }
        return hsetChanged;
    }
 }

