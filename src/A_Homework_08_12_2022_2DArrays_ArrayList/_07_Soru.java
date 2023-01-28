package A_Homework_08_12_2022_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        // getLength() isminde bir method olusturun.
        // parametre olarak String ArrayList
        // return tipi Integer ArrayList
        // ArrayList icindeki her bir Stringin uzunlugunu bulunuz.
        // Tum elementlerin uzunlugunu dondurun.
        // ArrayList : "New Jersey" , "New York" , "Ohio" , "Florida" , "Boston"
        // Tum Stringlerin uzunlugunu yazdirin.
        // cevap : 10 , 8 , 4 , 7 , 6 olmali

        ArrayList<String> sehirler = new ArrayList<>(Arrays.asList("New Jersey" , "New York" , "Ohio" , "Florida" , "Boston"));

        getLength(sehirler);
        System.out.println("Length of elements -> " + getLength(sehirler));
    }
    public static ArrayList<Integer> getLength(ArrayList<String> aList) {
        int length = 0;
        String kelime;
        ArrayList<Integer> uzunluk = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {
            kelime = aList.get(i);
            length = kelime.length();
            uzunluk.add(kelime.length());
            }
        return uzunluk;
    }
}
