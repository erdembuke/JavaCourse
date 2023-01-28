package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.HashSet;

public class _06_OzelSoru {
    public static void main(String[] args) {
        /**
          Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
         random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
         sayılarla doldurunuz. Set i main de yazdırınız.
         */
        HashSet<Integer> hset = new HashSet<>();
        randomFill(hset);
        System.out.println("hset with random numbers until 20 is = " + hset);

    }
    public static void randomFill(HashSet<Integer> hs1) {
        for (int i = 0; i >= 0; i++) {
            hs1.add((int)((Math.random())*20));
            if (hs1.size() == 10)
                break;
        }
    }
}
