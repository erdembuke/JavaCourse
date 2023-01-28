package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayidan büyük olanini bulun
        Scanner scInt = new Scanner(System.in);
        System.out.print("3 adet sayi girin -> ");

        int s1 = scInt.nextInt();
        int s2 = scInt.nextInt();
        int s3 = scInt.nextInt();

        // 1. yontem
        System.out.println("en buyugu = " + Math.max(s1 , (Math.max(s2,s3))));

        // 2. yontem
        int enbuyuk = Math.max(s1,s2);
        enbuyuk = Math.max(enbuyuk,s3);
        System.out.println("enbuyuk = " + enbuyuk);



    }
}
