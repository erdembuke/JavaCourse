package A_Homework_08_12_2022_Methods;

public class _01_Soru {
    public static void main(String[] args) {
        /*
           ismi "randomNum" olan bir method olusturun
           Parametre olarak "int max" almali
           bu method 0 ile max arasinda random bir deger dondurmelidir
           random degeri dondurunuz.
        */
        randomNum(20);

    }
    public static void randomNum(int max) {
        System.out.println((int)(Math.random()*max));
    }
}
