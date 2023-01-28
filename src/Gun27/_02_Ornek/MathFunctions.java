package Gun27._02_Ornek;

public class MathFunctions {

    public static int total(int a ,int ... number)  {
        int total = 0;

        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        return total;
    }

    public static int maximum(int a, int b) {
        if (a>b)
            return a;
        else return b;
    }

    public static int minimum(int a , int b) {
        if (a<b)
            return a;
        else return b;
    }

    public static int absolute (int a) {
        if (a<0)
            return a*-1;
        else return a;
    }

    public static int takeRandom(int max) {
        return (int)(Math.random()*max);
    }


}
