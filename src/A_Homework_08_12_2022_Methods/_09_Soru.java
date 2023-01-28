package A_Homework_08_12_2022_Methods;

public class _09_Soru {
    public static void main(String[] args) {
        // isUnique adinda bir method olusturun
        // parametre olarak int array alir
        // ve bu dizideki degerlerin benzersiz olup olmadigini gosteren bir boolean degeri dondurur
        // benzerlik yoksa true var ise false
        // örn int[] list = {3,8,12,2,9,17,43,-8,46,203,14,97,10,4}  ( yenilenen eleman yok true donmeli )
        // int[] list = {4,7,2,3,9,12,-47,-19,308,3,74}  Bu listede 3 elemani, iki tane oldugu icin sonuc false donmeli
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 94, 10, 4}; // "true"
        int[] list2 = {4,7,2,3,9,12,-47,-19,308,3,74};


        isUnique(list);
        isUnique(list2);


    }

    public static void isUnique(int[] dizi) {
        boolean esitMi = true;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    esitMi = false;
                }

            }
        }
        System.out.println("esitMi = " + esitMi);
    }
}
