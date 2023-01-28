package Gun06;

import java.util.Scanner;

public class _04_Soru1 {
    public static void main(String[] args) {
        // Soru : Girilen bir stringin son harfini yazdiriniz

        Scanner readSt = new Scanner(System.in);
        System.out.print("Type any word -> ");
        String word = readSt.nextLine();

        //  01234
        //  bugun -> son harfin numarası uzunlugun 1 eksigi
        int length = word.length();
        char lastLetter = word.charAt(length-1);

        System.out.println("lastLetter = " + lastLetter);











    }
}
