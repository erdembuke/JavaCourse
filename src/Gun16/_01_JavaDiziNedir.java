package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int ogrNot; // 1 tane not saklar

        // 50 kişi var
        int ogr1not;
        int ogr2not;
        int ogr3not;
        // .....
        // .....
        // .....
        int ogr50not;

        // bana bir tanimlamada birden fazla deger tutabilen bir degisken lazim;
        // cozum :

        int[] notlar = new int[50]; // 50 tane int degiskeni saklayan notlar isimli degisken

        notlar[0] = 75; // 0 dan baslar index 0 dan basladigindan dolayı
        notlar[1] = 88;
        // .....
        // .....
        notlar[49] = 95; // 49 a kadar gider cünkü indexte uzunluk -1 e kadar gidebilir 0 dan basladigi icin
        // notlar[50] = 22; challanger patlar

        System.out.println("notlar = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length); // 50 yani toplam eleman sayisini verir

        Scanner scInt = new Scanner(System.in);
        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu giriniz -> ");
            notlar[i] = scInt.nextInt();
        }
        for (int i=0; i < notlar.length; i++){
            System.out.println(notlar[i]);
        }




    }
}
