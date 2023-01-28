package A_Homework_01_12_2022_Arrays;

public class _06_Soru {
    public static void main(String[] args) {
        // String Array(dizi) olusturun. elemanlari : Apple,Orange,Banana,Kiwi
        // array'daki bütün elemanlari yazdiriniz.
        String[] dize6 = {"Apple","Orange","Banana","Kiwi"};

        for (int i = 0; i < dize6.length; i++) {
            System.out.println("Dizinin" + " " + (i+1) + ". elemanı -> " + dize6[i]);
        }

    }
}
