package B_Mentoring4;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        // TODO : mentoring odevi sorusu 3
        // Ornek 4 : Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

        String str = String.copyValueOf(ch);
        System.out.print(str);
        }
}

