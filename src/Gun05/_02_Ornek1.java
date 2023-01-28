package Gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        // Girilen bir adi ekrana yazdiriniz.
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Adinizi giriniz = ");

        String Adiniz = okuyucu.next(); // next() sadece bir kelime okur

        System.out.println("Adiniz = " + Adiniz);
          /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü oku

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okuma için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için

          okuyucu.nextBoolean(); -> true veya false girisi icin
          */


    }
}
