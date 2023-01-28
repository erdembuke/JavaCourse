package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // TODO : tekrar et
        // girilen bir sayinin tek mi cift mi oldugunu yazin
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi -> ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("cift");
        else
            System.out.println("tek");

        // ternary ile asagidaki gibi yapiliyor

        String sonuc = (sayi % 2 == 0) ? "çift" : "tek"; // ? -> if      : -> else

        System.out.println("sonuc = " + sonuc);

        System.out.println((sayi % 2 == 0) ? "çift" : "tek");

    }
}
