package A_Homework_08_12_2022_Methods;

public class _03_Soru {
    public static void main(String[] args) {
        /*
        reverseString isminde bir method olusturun
        bu method bir String'i parametre olarak alsin
        ve bu method, girilen stringi tersten yazdirsin
        terste yazilmis halini yazdirin
        Orn: String = "Java'yi Seviyorum."
        print : .muroyiveS ıy'avaJ
         */

        String cumle = "Java'yi Seviyorum.";
        reverseString(cumle);
        String cumle2 = "Bugun butun odevlerimi yaptim.";
        reverseString(cumle2);
    }
    public static void reverseString(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
