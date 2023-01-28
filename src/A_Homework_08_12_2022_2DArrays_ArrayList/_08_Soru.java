package A_Homework_08_12_2022_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Soru {
    public static void main(String[] args) {
        // ismi changeInArrayList() olan bir method olusturun.
        // Parametre olarak String ArrayList , String s1, String s2
        // Arraylist'te s1 i s2 olarak degistirin.
        // return String ArrayList
        // Ornegin ArrayList : "yellow" , "red" , "blue" , "red" , "blue"
        // s1 = blue / s2 = yellow
        // Tum blue' lari yellow a dönüstürün.
        // Cevap : "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> colours = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));

        changeInArrayList(colours,"blue","yellow");
        System.out.println("colours = " + colours);

    }
    public static ArrayList<String> changeInArrayList(ArrayList<String> aList , String s1, String s2) {

        for (int i = 0; i < aList.size(); i++) {
            if(aList.get(i).equalsIgnoreCase(s1))
                aList.set(i,s2);
        }
        return aList;

    }
}
