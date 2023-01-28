package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.
        Scanner readInt = new Scanner(System.in);
        System.out.print("Sayi girin -> ");
        int sayi = readInt.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Sayi cift !");
        }
        if (sayi % 2 != 0) { // 1 veya -1 gelebilmesi icin böyle
            System.out.println("Sayi tek !");
        }
    }
}
