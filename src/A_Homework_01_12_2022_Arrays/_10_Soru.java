package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _10_Soru {
    public static void main(String[] args) {
        // int array olusturun ve elemanlari : 14,19,5,21
        // en küçük (minimum) sayi yazdirin
        int[] sayilar10 = {14,19,5,21};
        Arrays.sort(sayilar10);
        System.out.println("En kucuk sayi = " + sayilar10[0]);
    }
}
