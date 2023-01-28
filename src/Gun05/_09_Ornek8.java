package Gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {

        // Soru : Kullanicidan agirligini double, boyunu double olarak aliniz
        // ve bir satirda boyunuz ve kilonuz seklinde yazdiriniz
        // vucut kitle indexini de bularak yazdirin     *** kilo / (boy*boy) ***

        Scanner oku = new Scanner(System.in);

        System.out.print("Agirliginizi Giriniz = ");
        double kilo = oku.nextDouble();

        System.out.print("Boyunuzu Giriniz = ");
        double boy = oku.nextDouble();

        double index = kilo / (boy*boy);

        System.out.println("Boyunuz ve Agirliginiz = " + boy + " / " + kilo);
        System.out.println("Vucut Kitle Indexiniz = " + index);






    }
}
