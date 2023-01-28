package Gun42;


import java.util.ArrayList;
import java.util.Arrays;

public class _02_JavaVeriTipleri {

    public static void main(String[] args) {
        // ilkel tipler , primitive tipler : byte , short , int , long , float , double , boolean
        int sayi1 = 5;
        int sayi2 = 10;

        sayi1 = sayi2; // sayi1 = 10
        sayi1 = 34;
        sayi2 = 45;

        System.out.println("sayi1 = " + sayi1);  // 34
        System.out.println("sayi2 = " + sayi2);  // 45

        // Referans tipler

        int[] dizi1 = {1,2,3,4};
        int[] dizi2 = {5,6};
        System.out.println("(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("(dizi2) = " + Arrays.toString(dizi2));

        dizi1 = dizi2;
        System.out.println("\n-----dizi1'i dizi2'ye esitledik-----\n");
        System.out.println("(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("(dizi2) = " + Arrays.toString(dizi2));

        dizi1[0] = 67;

        System.out.println("\n-----dizi1 in 0. elemanini 67 iledegistirdik-----\n");
        System.out.println("(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("(dizi2) = " + Arrays.toString(dizi2));
        System.out.println("\nArtik ayni yeri gosterdikleri icin ikisinin de elemani degisti\n");

        dizi2[0] = 55;
        System.out.println("-----dizi2 in 0. elemanini 55 iledegistirdik-----\n");
        System.out.println("(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("(dizi2) = " + Arrays.toString(dizi2));
        System.out.println("\nArtik ayni yeri gosterdikleri icin ikisinin de elemani degisti\n");

        // Nesne tipler : NULL alabilen ilkel tip.
        // String, Integer , Double , Long
        String ad1 = "mehmet";
        String ad2 = "ismet";

        ad1 = ad2;
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1 = "Ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);





    }
}
