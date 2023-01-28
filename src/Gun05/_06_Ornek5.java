package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {

        // Bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz ve yazdiriniz
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir karenin kenar uzunlugunu giriniz ");
        int kenar1 = oku.nextInt();

        int cevre = kenar1 + kenar1 + kenar1 + kenar1;
        int alan = kenar1*kenar1;

        System.out.println("Karenin cevresi = " + cevre);
        System.out.println("Karenin alani = " + alan);










    }
}
