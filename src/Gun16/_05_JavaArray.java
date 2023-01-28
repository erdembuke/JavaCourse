package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        System.out.println("KANAL D , SHOW TV , TV8 , ATV , TLC kanallari arasindan random olani secme sihirbazi");
        String[] kanal = {"Kanal D","Show TV","Tv8","Atv","TLC"}; // 01234
        int random = (int)(Math.random()*(kanal.length));
        System.out.println("Seçilen kanal -> " + kanal[random]);

        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO : fakat bir buldugunu tekrar bulmasın




    }
}
