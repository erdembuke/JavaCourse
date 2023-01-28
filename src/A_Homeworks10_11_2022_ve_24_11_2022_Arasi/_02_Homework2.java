package A_Homeworks10_11_2022_ve_24_11_2022_Arasi;

import java.util.Scanner;

public class _02_Homework2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Soru 1 : Bir String olusturun. konsola isminizi girin ve isminizi yazdirin.

        System.out.print("Type your name = ");
        String isim1 = reader.nextLine();
        System.out.println("Your name is = " + isim1);

        // Soru 2 : Bir int olusturun. Konsol'a herhangi bir sayi girin.Bu sayiyi yazdirin

        System.out.print("Type a number = ");
        int sayi2 = reader.nextInt();
        System.out.println("The number is = " + sayi2);

        // Soru 3 : Bir String olusturun. Konsola sevdiginiz bir meyveyi yazin.O Meyveyi yazdirin.

        Scanner reader2 = new Scanner(System.in);
        System.out.print("A fruit u like = ");
        String fruit = reader2.nextLine();
        System.out.println("Fruit = " + fruit);

        // Soru 4 : Bir int olustur.Konsola arabanizdaki kapi sayisini girin.yazdirin

        System.out.print("How many doors your car has ? ");
        int doors = reader2.nextInt();
        System.out.println("Door number is = " + doors);

        // Soru 5 : Bir string olustur. Konsola 10 sene onceki yasadigin sehri yaz. bu stringi yazdir

        Scanner reader3 = new Scanner(System.in);
        System.out.print("Which city did you live 10 years ago ");
        String city = reader3.nextLine();
        System.out.println("You did live in = " + city);

        // Soru 6 : Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.

        System.out.print("When is your birthday? ");
        String birthDay = reader3.nextLine();
        System.out.println("Your birthday is " + birthDay);

        /*Soru 7 : Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.*/

        Scanner reader4 = new Scanner(System.in);
        System.out.print("Do you have a bank account? ");
        boolean doYou = reader4.nextBoolean();
        System.out.println("Bank Account = " + doYou);

        // Soru 8 : Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        System.out.print("Your weight = ");
        byte weight = reader4.nextByte();
        System.out.println("Your weight is " + weight);

        // Soru 9 : Bir float olusturun. Konsola boyunuzu girin. float'i yazdirin

        Scanner reader5 = new Scanner(System.in);
        System.out.print("What is your height ex.(1,75) ");
        float height9 = reader5.nextFloat();
        System.out.println("your height is " + height9);

    }
}
