package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _11_Soru {
    public static void main(String[] args) {
        // int array olusturun. elemanlari : 12,2,5,15,8
        // en büyük degeri yazdirin

        int[] sayilar11 = {12,2,5,15,8};
        Arrays.sort(sayilar11);
        System.out.println("En büyük sayi = " + sayilar11[sayilar11.length-1]);
    }
}
