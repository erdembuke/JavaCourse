package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Soru : Girilen bir cumlede a harfinin gecip gecmedigini
        // bulunuz. geciyorsa evet gecmiyorsa hayir
        Scanner readStr = new Scanner(System.in);
        System.out.print("Cumle girin -> ");
        String cumle = readStr.nextLine();
        if (cumle.contains("a")) {
            System.out.println("a iceriyor!");
        }
        if (!cumle.contains("a")) {
            System.out.println("a icermiyor! ");
        }

        // 2. cözüm indexOf ile
        if (cumle.indexOf("a") != -1) {
            System.out.println("a iceriyor!");
        }
        if (cumle.indexOf("a") == -1) {
            System.out.println("a icermiyor!");
        }
        // 3. yol boolean
        boolean varMi = cumle.contains("a");
        if (varMi == true) {
            System.out.println("a iceriyor!");
        }
        if (varMi == false) {
            System.out.println("a icermiyor!");
        }

    }
}
