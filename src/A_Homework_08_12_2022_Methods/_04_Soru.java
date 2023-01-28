package A_Homework_08_12_2022_Methods;

public class _04_Soru {
    public static void main(String[] args) {
        // adi reverseWord olan bir method olusturun
        // bu methodun String olarak bir parametresi olmalidir.
        // ve bu cumledeki kelimeleri tersine cevirmeli
        // Ters Halini yazdirin . Ornek : Dize : Java yazin
        // dönüş şöyle olmali = yazin Java
        String exp = "Java yazin";
        reverseWord(exp);
    }
    public static void reverseWord(String sentence) {
        int bosIndex = sentence.indexOf(" ");

        String reverse = sentence.substring(bosIndex,sentence.length()) + " " + sentence.substring(0,bosIndex);
        System.out.println("reverse = " + reverse);
    }
}
