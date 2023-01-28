package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        try{
            Scanner scan = new Scanner(System.in);

            System.out.print("Sayi1 = ");
            int sayi1 = scan.nextInt();

            System.out.print("Sayi2 = ");
            int sayi2 = scan.nextInt();

            int bolum = (sayi1 / sayi2);
            System.out.println("Bolum = " + bolum);

            // String kelime = "";
            // kelime.charAt(3);
        }catch(InputMismatchException ex) // en genel hata
        {
            System.out.println("lütfen geçerli bir sayi giriniz");
        }
        catch (ArithmeticException ex){
            System.out.println("sayılar sıfıra bölünemez");
        }
        catch (Exception ex) {
            System.out.println("beklenmeyen hata " + ex.getMessage());
        }

        System.out.println("Program bitti");
    }
}
