package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen cumledeki kucuk veya buyuk a harfinin olup olmadigini yazdiriniz
        // var veya yok seklinde
        Scanner readStr = new Scanner(System.in);
        System.out.print("Cumle giriniz -> ");
        String cumle = readStr.nextLine();
        cumle = cumle.toLowerCase();
        if (cumle.contains("a")) {
            System.out.println("buyuk veya kucuk a iceriyor");
        }
        if (!cumle.contains("a")) {
            System.out.println("buyuk veya kucuk a icermiyor !");
        }

    }
}
