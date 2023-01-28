package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        // Kullanicinin adini ve soyadini alarak ekrana yazdriniz

        Scanner reader = new Scanner(System.in); // okuma islemini yapacak olan degisken tanimladi

        System.out.print("Adinizi ve Soyadinizi giriniz. "); // kullaniciyi bilgiendirmek icin ekrana neyin girilcegini yazdik

        String AdSoyad = reader.nextLine(); // okuma islemi bu  noktada yapiliyor

        System.out.println("Adiniz ve Soyadiniz = " + AdSoyad); // verinin gerçekten okunabildiğini kontrol ettim


    }
}
