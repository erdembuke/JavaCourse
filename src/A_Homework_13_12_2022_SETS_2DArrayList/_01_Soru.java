package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _01_Soru {
    public static void main(String[] args) {
        /**
        Create a method totalCount()

        totalCount() isminde bir method oluşturun.

        Parametresi  'Integer Hashset' olmalı

        HashSetteki eleman sayısını alın.

        totalCount'u döndürün.

        _**Örnek:**_

        hashset ; 4,2,3,1,7

        cevap: 5
         */
        Set<Integer> hashset = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        totalCount(hashset);
    }
    public static void totalCount(Set<Integer> hset) {
        System.out.println("Total count = " + hset.size());
    }
}
