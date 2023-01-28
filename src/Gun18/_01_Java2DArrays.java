package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi = 0; // 1 tane sayi

        int[] dizi = new int[100];  // 100 tane sayi

        int[] ders1Notlari = new int[50]; // 50 kişilik sinifin 1. dersinin notlari
        int[] ders2Notlari = new int[50];
        int[] ders3Notlari = new int[50]; // 0-49 arasi index

        int[][] tumDersNotlari = new int[3][50]; // 3 tane ders 50 tane ogrenci, 150 tane sayi
                                                 // 3 satir 50 sütun
                                                 // Her satir 50 tane sayi
                                                 // 0. satir , 1. satir , 2. satir
                                                 // satir : 0,1,2    sütun : 0,1,2,3,....,49
        
        ders1Notlari[0] = 80; // tek boyutlu dizinin ilk(0) elemanina 80 degerini atadik
        tumDersNotlari[0][0] = 80; // 2 boyutlu dizide 0. satirin, 0. sütünuna 80 degeri atandi
        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();
    }
}
