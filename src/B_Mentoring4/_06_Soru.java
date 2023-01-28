package B_Mentoring4;

import java.util.ArrayList;
import java.util.Collections;

public class _06_Soru {
    public static void main(String[] args) {
        // TODO : mentoring odevi sorusu 3
        // Ornek 3 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..
        int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        ArrayList<Integer> aList = new ArrayList<>();
        int rpt = 0;

        for (int i = 0; i <numbers.length ; i++) {
            rpt = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    rpt++;
            }
            aList.add(rpt-1);
        }
        System.out.println("Sıra ile her indexteki elemanın tekrar sayisi = " + aList);
    }
}
