package A_Homework_01_12_2022_Arrays;

public class _01_Soru {
    public static void main(String[] args) {
        // 1 - Bu String'i oluşturun. "Removes white space from both ends of a string"
        // String'deki kelime sayısını yazdırınız.

        String cumle = "Removes white space from both ends of a string";
        int boslukSayi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                boslukSayi++;

            }

        }
        System.out.println("Bu stringdeki kelime sayisi = " + (boslukSayi+1));





    }
}
