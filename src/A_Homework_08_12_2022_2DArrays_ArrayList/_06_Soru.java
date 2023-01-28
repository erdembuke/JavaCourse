package A_Homework_08_12_2022_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_Soru {
    public static void main(String[] args) {
        // getSum() isminde bir method olusturun
        // parametresi ArrayList olmali
        // return tipi int olmali
        // ArrayList'deki tüm sayilari birbiri ile toplayin.
        // return olarak toplam sonucu dondurun.
        // Ornegin : ArrayList = 1,2,3,4,5
        // Return 15 Olmali.

        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        getSum(sayilar);
        System.out.println("toplam = " + getSum(sayilar));

    }
    public static int getSum(ArrayList<Integer> aList) {
        int t = 0;

        for (int i = 0; i < aList.size(); i++) {
            t += aList.get(i);
        }
        return t;
    }
}
