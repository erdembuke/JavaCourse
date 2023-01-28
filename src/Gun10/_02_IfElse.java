package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // girilen vize (%50) ve final (%50) notunu okuyarak ortalamyi bulun
        // ortalama 60 dan buyukesit ise gectiniztebrikler yazin degilse bütünlemeye kaldiniz seklinde yazdirin

        Scanner readInt = new Scanner(System.in);
        System.out.print("Vize Notu Girin -> ");
        int vizeNot = readInt.nextInt();
        System.out.print("Final Notu Girin -> ");
        int finalNot = readInt.nextInt();

        int notOrt = ((vizeNot + finalNot) / 2);

        if (notOrt >= 60) {
            System.out.println("Gectiniz , Tebrikler !");
        }
        else {
            System.out.println("Butunlemeye Kaldiniz :( ");
        }

    }
}
