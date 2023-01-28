package A_Homework_08_12_2022_Methods;

import java.util.ArrayList;
import java.util.List;

public class _05_Soru {
    public static void main(String[] args) {
        // EvenOddNums isminde bir method olusturun
        // bu yontem String olan bir parametreyi kabul etsin
        // Bu String'de 1234567890 gibi 10 haneli sayilar olacak.
        // Sayilarin her basamagini alin ve basamak ciftse toplayin , tekse cikartin.
        // toplam sonucu yazdirin.
        // ipucu : sayilar islemleri yapabilmeniz , basamaklari tam sayiya dönüstürmeniz gerekiyor
        // ornek : String = 6678421312
        // 6+6-7+8+4+2-1-3-1+2
        // sonuc 16 olmali
        
        String sayilar = "6678421312";
        EvenOddNums(sayilar);
        System.out.println("EvenOddNums(sayilar) = " + EvenOddNums(sayilar));


    }
    public static int EvenOddNums(String numbers) {
        int basIndex = 0;
        int durIndex = 1;
        int total = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            list.add(Integer.parseInt(numbers.substring(basIndex,durIndex)));
            basIndex++;
            durIndex++;
            if (list.get(i) % 2 == 0) {
                total += list.get(i);
            }else if (list.get(i) % 2 != 0) {
                total -= list.get(i);
            }
        }
        return total;
        
    }

}
