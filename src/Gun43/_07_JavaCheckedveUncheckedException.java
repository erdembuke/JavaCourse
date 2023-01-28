package Gun43;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        String str = "";

        char ilkHarf = str.charAt(0);
        // sen bilirsin ister try-catch kullan ister kullanma.
        // Unchecked Exception yani.


        // Checked Exception , try-catch mecbur
        // Yapmazsan alti kirmizi cizili hata verir. (compile error diyebiliriz)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

    }
}
