package A_Homeworks10_11_2022_ve_24_11_2022_Arasi;

import java.util.Scanner;

public class _04_Homework4_DoWhile {
    public static void main(String[] args) {
        // 1 - Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner scInt = new Scanner(System.in);
        int i = 1;
        int t = 0;

        while (i <= 20) {
            System.out.print(i + ". sayi girin -> ");
            int sayi1 = scInt.nextInt();

            if (sayi1 % 2 != 0)
                t = t + sayi1;
            i++;
        }
        System.out.println("tek sayilar toplami = " + t);

        // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        int i2 = 1;
        int tekSayi = 0;

        do {
            System.out.println(i2 + ". sayiyi girin -> ");
            int sayi2 = scInt.nextInt();

            if (sayi2 % 2 != 0)
                tekSayi++;
            i2++;

        }while (i2 <= 20);
        System.out.println("Yapılan tek sayi girişi sayisi = " + tekSayi);

        // 3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        int i3 = 1;
        int t3 = 0;

        System.out.print("Kaca kadar olan sayilarin toplami -> ");
        int until = scInt.nextInt();

        do {
            t3 += i3;
            i3++;
        }while (i3 <= until);
        System.out.println("toplam = " + t3);

        // 4 - Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        int i4 = 1;
        int t4 = 0;

        do {
            System.out.print(i4 + ". sayi girin -> ");
            int sayi4 = scInt.nextInt();

            if (sayi4 > 10 && sayi4 < 30)
                t4 += sayi4;
            i4++;
        }while (i4 <= 20);
        System.out.println("10 ile 30 arasinda olanlarin toplami = " + t4);

        // 5 - 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int i5 = 1;
        int kacAdet5 = 0;

        do {
            if (i5 % 10 == 5)
                kacAdet5++;
            i5++;
        }while (i5 <= 100);
        System.out.println("100 e kadar olan sayilardan birler basamagi 5 olanlarin sayisi = " + kacAdet5);

        /*  6- Bir sayı bulmaca oyunu yapılmak isteniyor
            bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
            Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
            bilemediniz yazıp tutulan sayıyı bildirsin.
            Eğer bilirse tebrikler yazsın.
        */
        int hak = 1;
        boolean bulduMu = false;
        int tutulanSayi = (int) (Math.random() * (20) + 10);
        System.out.println("Sayı bulma simülatörüne hoşgeldiniz ! tutulan 10-30 arasındaki sayıyı bilmeniz için 3 hakkınız var !");
        do {
            System.out.print(hak + ". tahmin -> ");
            int tahmin6 = scInt.nextInt();

            if (tahmin6 == tutulanSayi) {
                System.out.println("Tebrikler sayiyi buldunuz !");
                System.out.println("Tutulan Sayi " + tutulanSayi + " idi.");
                bulduMu = true;
                hak = 4;
            }else System.out.println("yanlis tahmin !");

            hak++;

        } while (hak <= 3);
        if (!bulduMu)
            System.out.println("Bilemediniz ! Tutulan Sayi " + tutulanSayi + " idi.");

        // Ozel Sorular Basliyor ! Asagida !


        // 7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        System.out.println("üç basamaklı bir sayı giriniz : ");
        int sayi7 = scInt.nextInt();
        int basamaktakiRakam;
        int i7= 1;
        while (sayi7 > 0) {
            basamaktakiRakam = sayi7 % 10;
            System.out.println(i7 + "ler basamagi " + basamaktakiRakam);
            sayi7 /= 10;
            i7 *= 10;
        }

        // 8- Girilen bir sayının kaç basamak olduğunu bulunuz.
        System.out.print("Bir sayi girin kac basamakli oldugunu bulalim -> ");
        int sayi8 = scInt.nextInt();
        int i8 = 0;
        while (sayi8 > 0) {
            sayi8 /= 10;
            i8++;
        }
        System.out.println("basamak sayisi = " + i8);
        //
        //        // 9 - Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

    }
}
