package Gun31._01_Enum;

import java.util.Scanner;

public class Ornek1Cozum {
    enum Aylar {
        TANIMSIZ,OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ,
        AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        System.out.print("Ay ismi girin kac gun surdugunu soyleyelim (ocak,subat,vs..) -> ");
        String secim = scStr.next();
        Aylar ay = Aylar.valueOf(secim.toUpperCase());

        switch (ay) {
            case SUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println(31);
                break;
            case NISAN:
            case MART:
            case EYLUL:
            case KASIM:
            case HAZIRAN:
                System.out.println(30);
                break;
            default:
                System.out.println("Gecersiz \"Ay\" ismi girdiniz");
        }
        if (ay == Aylar.MAYIS) {
            System.out.println("zam yapildi");
        }
        System.out.println("ay = " + ay); // toString
        System.out.println("ay.name() = " + ay.name()); // SIMGE olarak kulanilan kelimeyi yazdirir
        System.out.println("ay.ordinal() = " + ay.ordinal()); // SIMGE'nin indexi

        for (Aylar a : Aylar.values()) {
            System.out.println(a.name() + " " + a.ordinal());
        }
        /*
        -- Yazilim dillerind enum , enumaration ve enum sabitleri olarak adlandirilmaktadir
        tanimlanan degiskenlerin sabit deger almasi icin kullanilir. Tanimlanan bu sabit
        degerler bir grup olusturur. Erisilmesi , yönetilmesi ve anlasilmasi kolay hale gelir.

        -- bir sürü girilmesi gereken detayi tek seferde parti halinde giriyoruz
        daha sonra kullanmasi da kolay yazmasi da kolay oluyor.
         */
    }



}
