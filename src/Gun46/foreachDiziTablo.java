package Gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {
        int[] dizi = new int[]{1,2,3,4,5,6};

        int[] dizi1 = {1,2,3,4,5};

        int[] dizi2 = new int[5];
        dizi2[0] = 5;
        dizi2[1] = 5;
        dizi2[2] = 5;

        System.out.println("dizi1.length - " + dizi1.length); // dizinin eleman sayisi

        // index sirasiyla gittigi icin SIRA GARANTI
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i] + " ");
        }

        System.out.println();

        // sira garanti degil, normalde sonradan verir
        for (int abc : dizi1)   // icindeki elemanlari teker teker alarak eleman isimli degiskene atar
            System.out.print(abc + " ");

        // ** 2 boyutlu diziler yani tablolar

        int[][] tablo = new int[2][3];

        tablo[0][0] = 4;    tablo[0][1] = 14;   tablo[0][2] = 22;
        tablo[1][0] = 24;    tablo[1][1] = 34;   tablo[1][2] = 12;

        int[][] tablo2 = {  // elemanlar verildiginde zaten sayi
                            // elemanlardan geldigi icin sayi verilmez
                {31,31,31},
                {31,31,31}
        };

        int[][] tablo3 = new int[2][3];
        tablo3[0] = new int[] {2,3,4,5,6};
        tablo3[1] = new int[] {2,3};

        int[][] tablo4 = new int[2][3];

        // tablo4 : satir sayisi 2 , her satir kendi uzunlugu var , 1. satirin uzunlugu 3 , 2. satirin uzunlugu 3
        // tablo 3 : satir sayisi2, 0. satirin uzunlugu 5 , 1. satirin uzunlugu 2

        System.out.println("tablo3.length = " + tablo3.length); // tablo3 satir sayisi vericek 2 , tablonun elemanlari satirlardan olusur
        System.out.println("tablo3[0].length = " + tablo3[0].length); // 0. satirin length 5
        System.out.println("tablo3[1].length = " + tablo3[1].length); // 1. satirin length 2

        for (int i = 0; i < tablo3.length; i++) {

            for (int j = 0; j < tablo3[i].length; j++) {
                System.out.println(tablo3[i][j] + " "); // 0. satir icin 00,01,02,03,04
                                                        // 1. satir icin 10,11
            }
            System.out.println();
        }

        System.out.println("*************");
        for (int[] satir : tablo3) { // tablo3 elemanlari satirlardan olsuuyor onlarda her biri tek boyutlu dizi

            for (int eleman : satir) { // satirin elemanlari yan int yani sayi
                System.out.println(eleman + " ");
            }
            System.out.println();
        }
        System.out.println("******************");

        for (int[] satir : tablo3) {
            // 1. adimda satir 2 3 4 5 6 asagidaki dongu sadece 2,3 ü yazar
            // 2. adimda satir 2,3       asagidaki dongu satirin tamamini yani 2,3
            for (int i = 0; i < tablo3.length; i++) {  // tablo3.length 2
                System.out.println(satir[i]);
            }
            System.out.println();
        }








    }
}
