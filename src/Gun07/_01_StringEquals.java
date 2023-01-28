package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        String s2 = "MERHABA";
        boolean esitMi = s1.equals(s2);  // s1 eşit mi s2 ye
        System.out.println("esitMi = " + esitMi);
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1 = " + s1.equals("Merhaba"));




    }
}
