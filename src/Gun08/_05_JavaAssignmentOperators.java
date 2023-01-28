package Gun08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        // a=a+5;   // a ?  15 olur
        a += 5;   // yine aynı 15
        // a nin artis miktari 5 dir
        System.out.println("a = " + a);

        int b = 10;
        //b=b-5;    //b ? 5 oldu
        b -= 5;       // aynisi 5 olur
        //b nin azalis miktari 5
        System.out.println("b = " + b);

        int c = 10;
        //c=c/5     // c 2 olur
        c /= 5;  // c nin bölüm degeri 5dir
        System.out.println("c = " + c);

        int d = 10;
        // d=d*5    // d 50 olur
        d *= 5;
        System.out.println("d = " + d);

        int e = 10;
        e%=5;
        System.out.println("e = " + e);


    }
}
