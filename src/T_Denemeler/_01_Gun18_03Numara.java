package T_Denemeler;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Gun18_03Numara {
    public static void main(String[] args) {
        // Gunun sorusu : 3x2 lik bir sayiyi kullanicidan sayi alarak
        // doldurduktan sonra sadece tek elemanlarini tek boyutlu bir diziye atayiniz
        // TODO : tek for ile yapmaya calis - yapildi

        System.out.println("3x2 lik bir diziyi sizden doldurmanizi isteyecegiz");
        System.out.println("Sonrasinda girdiginiz sayilardan tek olanlari tek bir dizide yazdirip size gösterecegiz");
        int[][] t1 = new int[3][2];
        ArrayList<Integer> tekler = new ArrayList<>();
        Scanner scInt = new Scanner(System.in);

        for (int i = 0; i < t1.length; i++) {

            for (int j = 0; j < t1[i].length; j++) {
                System.out.print((i) + " indexli satirin " + j + " indexli elemanini girin -> ");
                t1[i][j] = scInt.nextInt();
                if (t1[i][j] % 2 !=0)
                    tekler.add(t1[i][j]);
            }
        }

        for (int i = 0; i < t1.length; i++) {
            System.out.print(i + " indexli satir -> ");
            for (int j = 0; j < t1[i].length; j++) {
                System.out.print(t1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("teklerin oldugu dizi -> " + tekler);



    }
}
