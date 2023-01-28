package B_Mentoring4;

import java.util.Arrays;

public class _01_Ornek {
    public static void main(String[] args) {

        // sabit sayili
        int[] numbers = new int[10];
        numbers[0] = 30;
        numbers[1] = 20;
        numbers[2] = 10;
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("siralanmis hali " + Arrays.toString(numbers));
        System.out.println("son eleman = " + numbers[numbers.length-1]);

        int numbers2[] = new int[10];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 10;
        numbers2[3] = 50;
        numbers2[4] = 11;
        numbers2[5] = 17;

        int[] numbers3 = {20,10,40,70,80,90,7,11,24,34};
    }

}
