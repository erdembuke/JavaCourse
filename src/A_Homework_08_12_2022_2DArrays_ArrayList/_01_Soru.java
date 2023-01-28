package A_Homework_08_12_2022_2DArrays_ArrayList;

public class _01_Soru {
    public static void main(String[] args) {
        /*  Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]

        Bütün 2'leri 6'yla değiştirin.

        Array'i yazdırınız.

         */
        int[][] dizi = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};


        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] == 2) {
                    dizi[i][j] = 6;
                }


            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i + "indexli satirdaki elemanlar -> ");

            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
