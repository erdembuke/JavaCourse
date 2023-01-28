package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // TODO: 15.12.2022 persembe 20:46 foreach anlatti
        // Bir okulda kayit programi icin Ogrenci bilgilerini alan modül
        // yazilacaktir. ogrenciye ait bilgiler (adi,soyadi,sinifi ve adres vardir)
        // bu yapiyi olusturun
        // daha sonra 3 tane ogrenci bilgilerini kullanicidan alip doldurunuz
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        ArrayList<Ogrenci> studentList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci newStudent = new Ogrenci();
            System.out.print((i+1) + ". Ogrenci adi girin -> ");
            newStudent.ad = scStr.nextLine();
            System.out.print((i+1) + ". Ogrenci soyadi girin -> ");
            newStudent.soyad = scStr.nextLine();
            System.out.print((i+1) + ". Ogrenci'nin sinifini girin -> ");
            newStudent.sinif = scInt.nextInt();
            System.out.print((i+1) + ". Ogrenci'nin adresini girin -> ");
            newStudent.adres = scStr.nextLine();

            studentList.add(newStudent);

            System.out.println("Ekleme Basarili !");

        }

        int sira = 1;
        for (Ogrenci ogr : studentList) {
            System.out.println(sira + ". ogr.ad = " + ogr.ad);
            System.out.println(sira + ". ogr.soyad = " + ogr.soyad);
            System.out.println(sira + ". ogr.sinif = " + ogr.sinif);
            System.out.println(sira + ". ogr.adres = " + ogr.adres);
            sira++;
        }


    }
}

