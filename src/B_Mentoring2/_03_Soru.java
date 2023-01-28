package B_Mentoring2;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Soru : Trafikte seyir halindeki kullanicidan trafik isiklarindan hangisinin yandigi bilgisini alip
        // yonlendirme yapan programi yaziniz.

        Scanner scStr = new Scanner(System.in);
        System.out.print("(turkce karakterler kullanmadan) Hangi renk yaniyor ? ");
        String light = scStr.nextLine();

        if (light.equalsIgnoreCase("kirmizi")) {
            System.out.println("Dur !");
        }
        else if (light.equalsIgnoreCase("sari")) {
            System.out.println("Hazirlan !");
        }
        else if (light.equalsIgnoreCase("yesil")) {
            System.out.println("Geç !");
        }
        else
            System.out.println("Yanlis giris !");
    }
}
