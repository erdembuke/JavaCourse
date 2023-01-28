package A_Homework_01_12_2022_Arrays;

import java.util.Arrays;

public class _12_Soru {
    public static void main(String[] args) {
        // String array olusturun. elemanlari : Apple,Orange,Banana,Pineapple
        // Apple elemanının array e ait olup olmadigini kontrol edin.
        // eger aitse "true" cevirin. Loops kullanin

        String[] meyveler = {"Apple","Orange","Banana","Pineapple"};
        boolean varMi = false;
        Arrays.sort(meyveler);
        System.out.println("Meyveler dizisi -> " + Arrays.toString(meyveler));

        for (int i = 0; i < meyveler.length; i++) {
            if (meyveler[i].equals("Apple")) {
                varMi = true;
            }else varMi = false;
        }
        if (varMi) {
            System.out.println("Apple dizide bulunuyor mu -> true");
        }else System.out.println("Apple dizide bulunuyor mu -> false");
    }
}
