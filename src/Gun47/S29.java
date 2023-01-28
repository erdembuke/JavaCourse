package Gun47;

import java.util.ArrayList;

public class S29 {
    public static void main(String[] args) {
        // ciktisi nedir

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);

        // points remove 1 yapinca int verdigimiz icin indexe göre siler , object olsaydi girileni sileri
        // object 1 i silmek icin ise ;;
        // points.remove((Object)1); seklinde yazardik
    }
}
