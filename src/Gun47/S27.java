package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S27 {
    public static void main(String[] args) {
        // ciktisi nedir
        List colors = new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2);
        colors.add(3,"cyan");
        System.out.println("colors = " + colors);
    }
}
