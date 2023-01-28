package Gun35._03_Soru;

import java.util.Scanner;

/*
1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
  olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
 */
public class SoruMain {

    public static void main(String[] args) {
        Ogrenci calisan1 = new Calisan();
        createObjectCalisanOrOgrenci(calisan1);
        System.out.println();

        Ogrenci ogrenci1 = new Ogrenci();
        createObjectCalisanOrOgrenci(ogrenci1);


    }

    public static void createObjectCalisanOrOgrenci(Ogrenci objectname) {
        Scanner scStr = new Scanner(System.in);
        Scanner scStr2 = new Scanner(System.in);
        if (objectname instanceof Calisan) {
            System.out.print("put Calisan name = ");
            String name = scStr.nextLine();
            objectname.setAd(name);
            System.out.print("put Calisan surname = ");
            String surname = scStr.nextLine();
            objectname.setSoyad(surname);
            System.out.print("put Calisan title = ");
            String title = scStr.nextLine();
            objectname.setGorevi(title);
            System.out.print("put Calisan department = ");
            String department = scStr.nextLine();
            ((Calisan) objectname).setDepartman(department);
            System.out.println("Calisan bilgileri -> " + objectname);
        } else {
            System.out.print("put Ogrenci name = ");
            String name = scStr.next();
            objectname.setAd(name);
            System.out.print("put Ogrenci surname = ");
            String surname = scStr.next();
            objectname.setSoyad(surname);
            System.out.print("put Ogrenci title = ");
            String title = scStr.next();
            objectname.setGorevi(title);
            System.out.print("put Ogrenci sube = ");
            String sube = scStr.next();
            objectname.setSubesi(sube);
            System.out.println("Ogrenci bilgileri = " + objectname);

        }
    }
}
