package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanicidan sayi alarak doldurunuz
        // daha sonra ayri bir döngüde en büyük sayiyi bulunuz
        Scanner scInt = new Scanner(System.in);
        int[][] tablo = new int[2][3];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print((i) + ". satirin" + j + " . sutununu girin -> ");
                tablo[i][j] = scInt.nextInt();
            }

        }

        // en buyugunu bulma dongusu

        int enBuyuk = tablo[0][0]; // enBuyuk = 0 yaparsak negatif girdigimizde problem yaratir o yuzden böyle.

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                if (tablo[i][j] > enBuyuk)
                    enBuyuk = tablo[i][j];
            }
        }
        System.out.println("En Buyuk Sayi -> " + enBuyuk);

        // TODO: Math.max ile yapmaya calis , hoca sonraki derste cozecek soruyu.

    }
}

