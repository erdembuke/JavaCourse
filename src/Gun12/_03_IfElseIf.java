package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // soru :kullanicidan Fizik : 90 seklinde not bilgisi aliniz
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scStr = new Scanner(System.in);
        System.out.print("Ders ve notunu (Fizik:90) şeklinde giriniz -> ");
        String dersVeNot = scStr.nextLine();

        int ind = dersVeNot.indexOf(":");
        int ogrNot = Integer.parseInt(dersVeNot.substring(ind+1));

        /* int ogrNot = Integer.parseInt(dersVeNot.replaceAll("[^0-9]","")); // 0-9 disindakileri sil
        iki nokta vs koyulmasina gerek kalmaz direkt not harici bütün yazilari siler ve öyle tarar
        */

        if (ogrNot >= 90 && ogrNot <=100) {
            System.out.println(ogrNot + "notu : A ");
        }
        else if (ogrNot >=80 && ogrNot < 90) {
            System.out.println(ogrNot + "notu : B ");
        }
        else if (ogrNot >=70 && ogrNot <80) {
            System.out.println(ogrNot + "notu : C ");
        }
        else if (ogrNot >=60 && ogrNot <70) {
            System.out.println(ogrNot + "notu : D ");
        }
        else if (ogrNot >=40 && ogrNot <60) {
            System.out.println(ogrNot + "notu : E ");
        }
        else if (ogrNot < 40 && ogrNot >=0) {
            System.out.println(ogrNot + "notu : F ");
        }
        else {
            System.out.println("Geçersiz not !");
        }





    }
}
