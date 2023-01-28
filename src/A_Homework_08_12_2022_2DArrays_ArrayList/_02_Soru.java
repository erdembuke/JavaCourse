package A_Homework_08_12_2022_2DArrays_ArrayList;

public class _02_Soru {
    public static void main(String[] args) {
       /*
            Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]

            2D array'de olan elemanları toplayınız.

            toplamı yazdırınız.

            Sonuç 32 olmalıdır.

        */

        int[][] dizi2 = {{5, 2, 1} , {10, 2, 3, 6} , {1, 2}};

        int t = 0;
        for (int i = 0; i < dizi2.length; i++) {

            for (int j = 0; j < dizi2[i].length; j++) {
                t += dizi2[i][j];
            }
        }
        System.out.println("2 boyutlu dizideki elemanlar toplami -> " + t);

    }
}
