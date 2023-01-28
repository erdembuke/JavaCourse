package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {

    public static void main(String[] args) {
        System.out.println("program is starting..");

        try { // dene, hatanin basladigi yerin ustune konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        } catch(Exception ex) { // hata oldugu zaman programi kirma

            System.out.println("tüm hata = " + ex);
            System.out.println("hatanin aciklamasi =" + ex.getMessage());
            // kendine hata mesajını mail atabilirsin
            // log tutma : program nasıl calısıyor , hata loglarını DB'ye (Database) yazabilirsin
        }

        System.out.println("program bitti");

        try {
            // Java ve Toollari calismaya devam et
            // Konuları öğrenmeye ve çalışmaya devam
        } // anlamadigin yer mi oldu ? kirilmadan devam et
        catch (Exception ex) {
            // hatanin sebebini anla
            // derse daha fazla odaklan
            // gereken videolari izle
            // grup calismasi yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin , DEVAM
        }
        // sonunda seni güzel bir meslek bekliyor.


    }
}
