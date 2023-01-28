package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10tl, 5saate kadar 15tl, 5 saatten sonra 20tl
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz

        Scanner scInt = new Scanner(System.in);
        System.out.print("Araç park süresini saat bazında sayi olarak yaziniz");
        int saat = scInt.nextInt();

        if (saat <= 3) {
            System.out.println("10tl");
        }
        else {

            if (saat <= 5){
                System.out.println("15tl");
            }
            else {
                System.out.println("20tl");
            }
        // TODO : ternary ile cozmeye calis - yapildi.



        }
        System.out.println((saat < 0 || saat > 24) ? "Gecersiz saat girdiniz,tekrar deneyin." : (saat > 0 && saat <=3) ? "10tl" : ((saat >=4 && saat <=5) ? "15tl" : "20tl"));
    }
}
