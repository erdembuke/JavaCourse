package A_Homework_08_12_2022_Methods;

import java.util.Arrays;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir diziyi tersten yazdiran bir metod yazin
        int[] dizi = {1,2,3,4,5,6,7,8,9};
        int[] dizi2 = {3,4,5,6,7,8,9,10,11,12,13,14,15};
        reverseArray(dizi);
        reverseArray(dizi2);
    }
    public static void reverseArray(int[] numbers) {
        int[] reverse = new int[numbers.length];
        int lastIndex = numbers.length-1;

        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[lastIndex];
            lastIndex--;
        }
        System.out.println("Tersi -> " + Arrays.toString(reverse));
    }
}
