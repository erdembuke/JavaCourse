package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Gunun sorusu : 3x2 lik bir sayiyi kullanicidan sayi alarak
        // doldurduktan sonra sadece tek elemanlarini tek boyutlu bir diziye atayiniz

        Scanner scInt = new Scanner(System.in);
        int[][] tablo = new int[3][2];

        // burası okuma islemi
        int tekMik = 0;

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i + ". satirin " + j + ". elemani girin -> ");
                tablo[i][j] = scInt.nextInt();

                if (tablo[i][j] % 2 != 0)
                    tekMik++;

            }

        }
        int[] tekDizisi = new int[tekMik]; // teklerin miktari kadar bir dizi
        tekMik = 0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j] %2 != 0) {
                    tekDizisi[tekMik] = tablo[i][j];
                    tekMik++;
                }
            }
        }
        System.out.println(Arrays.toString(tekDizisi));
        }

    }

