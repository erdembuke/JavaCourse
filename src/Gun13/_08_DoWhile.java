package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        //Kullanicidan x girilene kadar ekrana "Program Calisiyor" yazan
        // ve x girildiginde ise "program bitti" yazan programi yazin.

        Scanner scStr = new Scanner(System.in);
        String tahmin="";

        do {
            System.out.print("programi durduracak harfi girin :) -> ");
            tahmin = scStr.next();

            if (!tahmin.equalsIgnoreCase("x"))
              System.out.println("Program calismaya devam ediyor ! ");

        }while(!tahmin.equalsIgnoreCase("x"));

        System.out.println("Program durdu , tebrikler !");
    }
}
