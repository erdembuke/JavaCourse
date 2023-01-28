package B_Mentoring3;

public class _06_ornek {
    public static void main(String[] args) {

        // While Loop
        int sayi = 0;
        int sayac = 0;

        while (sayac < 10) {
            if (sayi > 10) {

                System.out.println("bildiniz!");
            }
            System.out.println("while dongusu cagrildi");
            sayac++;
        }

        // Do-While Loop - Neden 10 defa cagrilmadi =
        int y = 0;

        do {
            System.out.println("Do-While dongusu cagrildi");
        }while (y > 10);



    }
}
