package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Soru {
    public static void main(String[] args) {
        /**
         commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
         return tipi arraylist olmalı.
         **ÖRNEĞİN:**
         İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
         İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
         Ortak değerleri ArrayListe ekleyiniz.
         çıktı:  "Germany" , "Brazil" ,"USA"
         ArrayListi yazdırınız.
         */
        HashSet<String> nhs = new HashSet<>(Arrays.asList("Germany","England","South Africa","Brazil","USA"));
        HashSet<String> nhs2 = new HashSet<>(Arrays.asList("Germany","China","Brazil","France","USA"));
        System.out.println("commons = " + commonValues(nhs,nhs2));
    }

    public static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> commons = new ArrayList<>();

        Iterator<String> show1 = hs1.iterator();
        Iterator<String> show2 = hs2.iterator();

        for (int i = 0; i < hs1.size(); i++) {
            aList.add(show1.next());
        }
        for (int i = 0; i < hs2.size(); i++) {
            aList.add(show2.next());
        }

        for (int i = 0; i < hs1.size(); i++) {

            for (int j = hs1.size(); j < (hs2.size()+hs2.size()); j++) {
                if (aList.get(i).equals(aList.get(j))) {
                    commons.add(aList.get(i));
                }
            }
        }
        return commons;
    }
}
