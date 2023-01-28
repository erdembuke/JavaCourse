package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 6 elemanli bir dizinin
        // sadece tek sayi olan elemanlarini ayri diziye atayarak
        // yazdiriniz
        ArrayList<Integer> tekSayi = new ArrayList<>();
        int index = 0;
        int[] dizi = new int[6];
        Scanner scInt = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayi girin = ");
            dizi[i] = scInt.nextInt();
            if (dizi[i] % 2 != 0) {
                tekSayi.add(index,dizi[i]);
                index++;
            }
        }
        System.out.println("tekSayi = " + tekSayi);
    }
}
