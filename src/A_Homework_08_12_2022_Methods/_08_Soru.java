package A_Homework_08_12_2022_Methods;

import java.util.Arrays;

public class _08_Soru {
    public static void main(String[] args) {
        // append adinda bir method olusturun
        // parametre olarak iki int array olusturun.
        // ve ikinci array in degerlerini ilk array in sonuna ekleme sonucunu içeren yeni bir array dondurun
        // ornegin ilk array {2,4,6} ve ikinci array {1,2,3,4,5} ise
        // {2,4,6,1,2,3,4,5}
        int[] numbers1 = {2,4,6};
        int[] numbers2 = {1,2,3,4,5};
        append(numbers1,numbers2);

    }
    public static void append (int[] dizi1, int[] dizi2) {
        int birIndex = 0;

        int[] birlesim = new int[(dizi1.length) + (dizi2.length)];

        for (int i = 0; i < dizi1.length; i++) {
            birlesim[birIndex] = dizi1[i];
            birIndex++;
        }

        int scIndex = dizi1.length;
        for (int i = 0; i < dizi2.length; i++) {
            birlesim[scIndex] = dizi2[i];
            scIndex++;
        }
        System.out.println("birlesimleri -> " + Arrays.toString(birlesim));



        }
    }

