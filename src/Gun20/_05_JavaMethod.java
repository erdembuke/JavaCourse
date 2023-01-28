package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 34;

        int sonuc1 = toplamBul(s1,s2);
        int sonuc2 = toplamBul(s1,s2,s3);

        String ad = "erdem";
        String soyad = "buke";
        String birlesim = toplamBul(ad,soyad);
        System.out.println("birlesim = " + birlesim);

    }

    public static int toplamBul(int a, int b) {
        return a+b;
    }

    public static int toplamBul(int a, int b, int c) {
        return a+b+c;
    }

    public static String toplamBul(String a, String b) {
        return a + " " + b;
    }
}
