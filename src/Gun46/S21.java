package Gun46;

import java.util.Arrays;

public class S21 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        // 2 boyutlu dizilerin eleman sayisi diye inceledigimizde satir sayisi karsimiza cikar
        System.out.println(arr.length); // satir sayisini vercem
        System.out.println(arr[0].length); // 0. satirin eleman sayisi 4
        System.out.println(arr[1].length); // 1. satirin elman sayisi 2
        System.out.println("************");

        for (int[] a : arr) {

            // arr.length satir sayisini , a.length ise her satirin eleman sayisini temsil eder
            for (int i = 0; i < arr.length; i++) {  // a.length : satirin bütün elemanlarini yazması icin
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
