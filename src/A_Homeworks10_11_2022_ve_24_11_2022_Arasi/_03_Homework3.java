package A_Homeworks10_11_2022_ve_24_11_2022_Arasi;

import java.util.Scanner;

public class _03_Homework3 {
    public static void main(String[] args) {
        // 1 - "I love java" olan bir string olusturun , toplam karakter sayisini yazdirin :
        String isim1 = "I love java";
        int uzunluk1 = isim1.length();
        System.out.println("\"I love java\" nin Toplam karakter sayisi = " + uzunluk1);

        // 2 - "Sprint planning" olan bir string olusturun. bu dizenin toplam karakter sayisini yazdirin
        String isim2 = "Sprint planning";
        int uzunluk2 = isim2.length();
        System.out.println("\"Sprint planning\"in Toplam karakter sayisi = " + uzunluk2);

        // 3- "apple" olan bir string olusturun. String icinde "app" olup olmadıgını dogrula
        String isim3 = "apple";
        System.out.println("apple \"App\" iceriyor mu = " + isim3.contains("app"));

        // 4- "orange" kelimesinden olusan string olustur. string "apple" a esit mi degil mi dogrula
        String isim4 = "apple";
        System.out.println("\"Orange\" string i \"apple\" stringine esit mi = " + isim4.equals("Apple"));

        // 5- "apple" olan string olusturun. string in "apple"a esit olup olmadigini dogrula büyük kücük onemli degildir
        String isim5 = "apple";
        System.out.println("\"apple\" \"apple\" a esit mi = " + isim5.equalsIgnoreCase("apple"));

        // 6- "Florida" kelimesinden string olustur. kelime icinde sadece "o" harfinin bulundugu indexi yazin
        String isim6 = "Florida";
        int indexi = isim6.indexOf("o");
        System.out.println("\"o\" harfi index i = " + indexi);

        // 7 - "Thank you" oaln bir string olustur. sadece "y" harfinin bulundugu konumu yazdirin.
        String isim7 = "Thank you";
        int index7 = isim7.indexOf("y");
        System.out.println("index y = " + index7);

        // 8 - "Main method olustur". "Mouse" degerinde string yaz. Stringin 3. sirasindaki karakteri yazdir
        String isim8 = "Mouse";
        char karakter3 = isim8.charAt(3);
        System.out.println("karakter3 = " + karakter3);

        // 9 - "paper" stringi olustur. büyük harfe cevir ve yazdir
        String isim9 = "paper";
        System.out.println("paper to upper case = " + isim9.toUpperCase());

        // 10 - "OraNge" olan bir string olusturun. stringi kücük harfe cevir ve yazdir
        String isim10 = "OraNge";
        System.out.println("OraNge to lower case = " + isim10.toLowerCase());

        // 11 - "New Jersey" olan bir string olustur. büyük harfe cevir ve yazdir.
        String isim11 = "New Jersey";
        System.out.println("New Jersey to upper case = " + isim11.toUpperCase());

        // 12 - "New York" olan bir string olustur. kücük harfe cevir ve yazdir.
        String isim12 = "New York";
        System.out.println("New York to lower case = " + isim12.toLowerCase());

        // 13 - "PADDLE" olan bir string olustur. kücük harfe cevir ve yazdir
        String isim13 = "PADDLE";
        System.out.println("PADDLE to lower case = " + isim13.toLowerCase());

        // Ozel Soru 1 - Ayri ayri girilen ad ve soyadi aralarinda bir bosluk koyarak birlestiriniz.
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Type your name -> ");
        String ad1 = reader1.nextLine();
        System.out.print("Type your surname -> ");
        String soyad1 = reader1.nextLine();
        System.out.println("Name and Surname is -> " + ad1 + " " + soyad1);

        // Ozel Soru 2 - Girilen bir kelimenin boş(Blank) olup olmadigini yazdiriniz.
        System.out.print("Type a word -> ");
        String kelime2 = reader1.next();
        System.out.println("Is it blank ? = " + kelime2.isEmpty());

        // Ozel Soru 3 - Girilen bir cümledeki A harfi sayisini bulunuz (buyuk kucuk ayrimi yok) -------------///-----
        System.out.print("bir cumle giriniz -> ");
        String cumle3 = reader1.nextLine();
        cumle3.toLowerCase();
        String yenicumle = cumle3.replaceAll("[^a]","");
        int uzunluk = yenicumle.length();
        System.out.println("a sayisi = " + uzunluk);

        // Ozel Soru 4 - Girilen Bir kelimenin ilk ve son harfini bulunuz.
        System.out.print("Type a word -> ");
        String kelime4 = reader1.next();
        int length4 = kelime4.length();
        System.out.println("first letter of the word is " + kelime4.charAt(0));
        System.out.println("last letter of the word = " + kelime4.charAt(length4 - 1));

        // Ozel Soru 5 - Girilen bir cumledeki ilk kelimeyi yazdiriniz
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Type a sentence -> ");
        String cumle5 = reader2.nextLine();
        int bosluk1 = cumle5.indexOf(" ");
        System.out.println("cumle5 = " + cumle5.substring(0, bosluk1));

        // Ozel Soru 6 - girilen en az 3 kelimelik bir cumledeki ilk iki kelimeyi yazdirin.


        // Ozel Soru 7 - girilen bir cümlede kac kelime oldugunu bulun.

        System.out.print("Uzun cümle girin -> ");
        String cumle7 = reader2.nextLine();
        String bosluklar = cumle7.replaceAll("[^ ]" , "");
        int boslukSayisi = bosluklar.length()+1;
        System.out.println("Kelime sayisi -> " + boslukSayisi);

        // Ozel Soru 9 - 3 Kelimelik ismi olan kisinin ad , 2.ad ve soyadini A.E.Y seklinde yazin
        System.out.print("Isminizi yazin 3 kelimeli -> ");
        String cumle9 = reader2.nextLine();
        int ilkbosluk = cumle9.indexOf(" ");
        int ikincibosluk = cumle9.lastIndexOf(" ");
        System.out.println("ikincibosluk = " + ikincibosluk);

        System.out.println("ilkIsım = " + cumle9.charAt(0) + "." + cumle9.charAt(ilkbosluk + 1) + "." + cumle9.charAt(ikincibosluk + 1) + ".");


    }
}
