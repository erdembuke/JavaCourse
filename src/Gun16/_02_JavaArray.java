package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kisilik bir sinifin notlarini giriniz ve ortalamadan büyük
        // kac not oldugunu bulunuz ve bunlari yazdirin.
        Scanner scInt = new Scanner(System.in);
        int[] grade = new int[5];
        int toplam = 0;



        for (int index = 0; index < grade.length; index++) {
            System.out.print("Not girişi yapınız -> ");
            grade[index] = scInt.nextInt();
            toplam = toplam + grade[index];
        }

        int ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama);

        int gecenler = 0;
        for (int sayac = 0; sayac < grade.length; sayac++) {

            if (grade[sayac] > ortalama) {
                System.out.println("ortalamadan yüksek olan notlar -> " + grade[sayac]);
                gecenler++;
            }

        }

        System.out.println("gecenlerin sayisi -> " + gecenler);









        }
}
