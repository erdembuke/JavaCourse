package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.ArrayList;

public class _05_Soru {
    public static void main(String[] args) {
        /**
        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]

        Store all the elements in one arraylist and print the arraylist

        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        **Örnek:**
        ```
        **Girdi:**
        [
         [ 1, 2, 3 ],
         [ 4, 5, 6 ],
         [ 7, 8, 9 ]
        ]
        **Çıktı:** [1,2,3,4,5,6,7,8,9]
        ```
         */
        int[][] dizi = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        ArrayList<Integer> aList = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                aList.add(dizi[i][j]);
            }
        }
        System.out.println("2D Array elemanlarinin birlesimi = " + aList);

    }

}
