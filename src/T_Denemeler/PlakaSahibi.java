package T_Denemeler;

import java.util.Scanner;

public class PlakaSahibi {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        System.out.println("aracin plakasini girin sahibini ve arac ozelliklerini söyleyelim");
        boolean devamMi = false;


        do {
            System.out.print("Plaka girin -> ");
            String plaka = scStr.nextLine();

            if (plaka.equalsIgnoreCase("34 vp") || plaka.equalsIgnoreCase("34 vp 9458")) {
                System.out.println("2004 Volvo S40 2.0 Classic 136 HP Otomatik. Sahibi -> Enes BUKE");
            } else if (plaka.equalsIgnoreCase("06 bh") || plaka.equalsIgnoreCase("06 bh 9054")) {
                System.out.println("2007 SAAB 1.9 TDi Vector 150 HP Otomatik. Sahibi -> Ismail BUKE");
            } else if (plaka.equalsIgnoreCase("34 av")) {
                System.out.println("2004 Volvo S40 1.8 Classic 122 HP Otomatik. Sahibi -> Ali DUVAN");
            } else if (plaka.equalsIgnoreCase("16 P") || plaka.equalsIgnoreCase("16 P 0500")) {
                System.out.println("2000 Volvo S40 1.9 T4 200 HP Otomatik. Sahibi -> Ali DUVAN");
            } else if (plaka.equalsIgnoreCase("34 SC") || plaka.equalsIgnoreCase("34 SC 665")) {
                System.out.println("2001 Volvo V40 2.0 T4 200 HP Otomatik. Sahibi -> Erdem BUKE");
            } else if (plaka.equalsIgnoreCase("06 SA") || plaka.equalsIgnoreCase("06 SA 467")) {
                System.out.println("2003 Volvo S40 2.0 136 HP Otomatik. Sahibi -> Ali DUVAN");
            } else if (plaka.equalsIgnoreCase("34 AV") || plaka.equalsIgnoreCase("34 AV 5830")) {
                System.out.println("2004 Volvo S40 1.8 122 HP Otomatik. Sahibi -> Ali DUVAN");
            } else System.out.println("Sizin aileye ait olmayan bir araç plakası girdiniz");

            System.out.print("Plaka girmeye devam etmek istiyor musunuz ? (evet = e , hayır = h) -> ");
            String secim = scStr.nextLine();

            if (secim.equalsIgnoreCase("h"))
                devamMi = true;

        }while (!devamMi);
        System.out.println("Program bitti.");

    }
}

