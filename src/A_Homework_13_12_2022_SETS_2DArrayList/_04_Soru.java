package A_Homework_13_12_2022_SETS_2DArrayList;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _04_Soru {
    public static void main(String[] args) {
        /**
        removing() isminde bir method oluşturun.
        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        Return tipi linkedhashset
        Örneğin,
        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        String 1= Germany
        String 2 = USA
        **Germany ve USA 'i sil.**
        Set'i döndür.
         */
        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        System.out.println("New lhs = " + removing(lhs,"Germany","USA"));
    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String > lhs, String a, String b) {
        for (int i = 0; i < lhs.size(); i++) {
            if(lhs.contains(a)) {
                lhs.remove(a);
            }
            if (lhs.contains(b)) {
                lhs.remove(b);
            }
        }
        return lhs;
    }
}
