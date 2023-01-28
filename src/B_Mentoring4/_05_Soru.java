package B_Mentoring4;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_Soru {
    public static void main(String[] args) {
        // Ornek 2 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        ArrayList<Integer> Repeats = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < numbers2.length; i++) {

            for (int j = 0; j < i; j++) {
                if (numbers2[i] == numbers2[j]) {
                Repeats.add(index,numbers2[i]);
                index++;
                }
            }
        }
        System.out.println("\"numbers2\" dizisindeki elemanlar = " + Arrays.toString(numbers2));
        System.out.println("Dizideki tekrar eden sayilar = " + Repeats);

    }
}
