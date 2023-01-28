package A_Homework_01_12_2022_Arrays;

public class _02_Soru {
    public static void main(String[] args) {
         /*     2 - Bir String oluşturun : "Hello World"
                Stringi tersten yazdırın ve print edin.
                _Cevap böyle olmalı :  "dlroW olleH"_
        */
        String cumle2 = "Hello World";

        for (int i = cumle2.length()-1; i>=0; i--) {
            System.out.print(cumle2.charAt(i));


        }

        }
    }

