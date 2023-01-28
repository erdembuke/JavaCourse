package A_Homework_08_12_2022_2DArrays_ArrayList;

import java.util.ArrayList;

public class _04_Soru {
    public static void main(String[] args) {
        // bir tane 2d array[] [] olusturu nve elemanlari = [ [1,2,3] , [4,5,6] , [7,8,9] ]
        // Store all the elements in one arraylist and print the arraylist
        // Tum elemanlari bir ArrayList ' e yukleyin ve bu ArrayList'i yazdirin.
        // [1,2,3,4,5,6,7,8,9]
        int[][] dizi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i + " indexli dizinin elemanlari -> ");
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                numbers.add(dizi[i][j]);
            }
        }
        System.out.println("Dizinin tek bir ArrayList' e toplanmis hali = " + numbers);
    }
}
