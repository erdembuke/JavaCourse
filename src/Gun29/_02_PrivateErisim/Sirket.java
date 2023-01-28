package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 8162715;
        cal1.name = "Erdem";
        cal1.surname = "Buke";
        cal1.title = "Quality Assurance Tester";
        // cal1.password = "1234";
        // artik private,kendi paketinden bile cagrilamaz
        cal1.sifreAta("1234");
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();
    }
}
