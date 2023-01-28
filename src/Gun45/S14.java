package Gun45;

public class S14 {
    public static void main(String[] args) {
        // ciktisi nedir

        int data[] = {2010,2013,2014,2015,2014};
        int key = 2014;
        int count = 0;

        for (int e : data)
        {
            if (e != key) {
                continue;
                // count++;  continue den sonra komut yazarsak compile error verir o yuzden cevap compile error

            }
        }
        System.out.println(count + " found");
    }
}
