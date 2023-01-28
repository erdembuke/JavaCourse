package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _09_Soru {
    public static void main(String[] args) {
        // int array olusturun ve elemanlari : 15,25,22,18,30
        // Arraydaki en büyük 2. elemani yazdiran bir program yazin

        int[] sayilar9 = {15,25,22,18,30};

        Arrays.sort(sayilar9);

        System.out.println("En buyuk 2. sayi -> " + sayilar9[sayilar9.length-2]);
    }
}
