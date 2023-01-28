package B_Mentoring2;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        String userName = "TechnoStudy";
        String password = "12345";


        // yukaridaki kayitli bilgilere gore kullanicidan kullanici adi ve sifre alarak
        // 4 farkli opsiyon icin login islemlerini yazin

        // 1. opsiyon - kullanici adi ve sifre hatali
        // 2. opsiyon - sifre hatali
        // 3. opsiyon -- kullanici adi hatali
        // 4. opsiyon - sisteme giris basarili

        System.out.println("Giriş simülatör testine hoşgeldiniz !");
        Scanner scStr = new Scanner(System.in);

        System.out.print("kullanici adiniz -> ");
        String tahminID = scStr.nextLine();

        System.out.print("sifreniz -> ");
        String tahminPW = scStr.nextLine();

        if (!userName.equals(tahminID) && !password.equals(tahminPW)) {
            System.out.println("Kullanici adi ve sifre hatali !");

        }
        else if (userName.equals(tahminID) && !password.equals(tahminPW)) {
            System.out.println("Sifre hatali !");
        }
        else if (!userName.equals(tahminID)) {
            System.out.println("Kullanici adi hatali !");
        }
        else {
            System.out.println("Sisteme giris basarili !");
        }


    }
}
