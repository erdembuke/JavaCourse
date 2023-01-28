package Gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {
        
        String[] isimler = {"ahmet","zeynep","roman","yasin","cihan"};
        
        // diziyi string olarak direkt yazdirir
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        // dizi sıralama
        Arrays.sort(isimler);
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        // Diziler eşit mi ?
        int[] a = {1,8,3,54};
        int[] b = {1,8,3,54};
        int[] c = {1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false

        Arrays.sort(c);
        System.out.println("Arrays.toString(c) " + Arrays.toString(c));


        System.out.println("Arrays.binarySearch(c,2) = " + Arrays.binarySearch(b,3)); // dizi nin sıralı olması gerekir
        // sirali olmadigi icin eksi deger verecektir yani yok anlaminda , o yuzden siralayip bi daha yazdiriyoruz bu sefer
        // bulacak. "contains" gibi calisir varsa poziyif bir deger verir yoksa negatif.
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(c,2) = " + Arrays.binarySearch(b,3));

    }
}
