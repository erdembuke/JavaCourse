package Gun29._02_PrivateErisim;

public class Calisan {
    int id;             // default
    String name;        // default
    String surname;     // default
    String title;       // default
    private String password;

    public void sifreAta(String sifre) {
        // sifreyi kontrol ederek atayacagim.
        if (sifre.length() < 8)
            System.out.println("Gereklilikleri karsilamayan sifre.");
        else {
            password = sifre; // parametre sifre yerine password olsaydi ikisini ayirmak icin this.password = password yazicaktik
            System.out.println("Sifre basariyla atandi.");
        }
    }

    public void sifreGoster() {
        System.out.println("****" + password.substring(4));
    }
}
