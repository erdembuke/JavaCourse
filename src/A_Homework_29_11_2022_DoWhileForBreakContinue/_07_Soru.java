package A_Homework_29_11_2022_DoWhileForBreakContinue;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // uzunluk ve genisligini yazan kisinin belirledigi #bütünü olusturabilceginiz bir kod yazin
        // örn -> length(uzunluk) : 7 / width(genislik) : 5
        // output
        // #####
        // #####
        // #####
        // #####
        // #####
        // #####
        // #####

        Scanner scInt = new Scanner(System.in);
        System.out.println("girdiginiz satir ve miktar(genislik) kadar # işareti yazdirma uygulamasi");

        System.out.print("kac satir olsun -> ");
        int length = scInt.nextInt();
        System.out.print("her satirda kac adet olsun -> ");
        int width = scInt.nextInt();

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
