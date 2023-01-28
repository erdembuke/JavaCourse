package Gun45;

public class S14_2 {
    public static void main(String[] args) {
        // ciktisi nedir

        int data[] = {2010,2013,2014,2015,2014};
        int key = 2014;
        int count = 0;

        for (int e : data)
        {
            // 2014 ler geldigince calisMAYACAK
            if (e != key) {
                continue;
            }
            count++;
        }
        System.out.println(count + " found");
    }
}
