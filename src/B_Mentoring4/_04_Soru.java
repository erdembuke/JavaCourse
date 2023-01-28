package B_Mentoring4;

import java.util.Arrays;

public class _04_Soru {
    public static void main(String[] args) {
        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};
        System.out.println("Dizideki elemanlar = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Dizideki elemanlarin sirali hali = " + Arrays.toString(arr));
        System.out.println("En büyük eleman -> " + arr[arr.length-1]);
    }
}
