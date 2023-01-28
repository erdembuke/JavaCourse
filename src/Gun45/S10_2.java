package Gun45;

public class S10_2 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;

        for (String n : names) {
            try {

                pwd[idx] = n.substring(2, 6); // 2 dahil 6 hariç 2-5 arasi yani
                System.out.println(pwd[idx]); // omas
                idx++;

            } catch (Exception e) {
                System.out.println("Invalid name");
            }
        }
    }
}
