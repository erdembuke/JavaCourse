package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {

        // Soru :  yan yana aralarinda bir boslukla girilen 2 int sayisinin
        // birbirine esit olup olmadigini bulun
        // 45 , 67

        Scanner readStr = new Scanner(System.in);
        System.out.print("Yan yana iki adet sayi girin -> ");
        String sayilar = readStr.nextLine();
        int ilkBosluk = sayilar.indexOf(" ");
        String ilkSayi = sayilar.substring(0 , ilkBosluk);
        String ikinciSayi = sayilar.substring(ilkBosluk+1);

        if (ilkSayi.equals(ikinciSayi)) {
            System.out.println("Sayilar esit");
        }
        else {
            System.out.println("Sayilar farkli");
        }

        // 2. yontem (string ilksayi ikincisayi yaptiktan sonra)

        int sayi1 = Integer.parseInt(ilkSayi);
        int sayi2 = Integer.parseInt(ikinciSayi);

        if (sayi1 == sayi2) {
            System.out.println("sayilar esit");
        }
        else {
            System.out.println("sayilar farkli");
        }







    }
}
