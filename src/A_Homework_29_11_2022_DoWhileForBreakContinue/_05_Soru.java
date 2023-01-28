package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _05_Soru {
    public static void main(String[] args) {
        // 0 ile 100 arasindaki sayilari kapsayan bir kod yazin.
        // bu kod bu sayilarin tek mi cift mi oldugunu belirleyebilcek bi kod olmali
        // eger cift ise "This number is even and number is 0"
        // eger tek ise "This number is odd and number is 1"
        // yazdirmali sonuc böyle olmalidir
        // This number is even and number is 0
        // This number is odd and number is 1
        // This number is even and number is 2
        // This number is odd and number is 3

        int i = 0;

        do {
            if (i % 2 == 0) {
                System.out.println("This number is even and number is " + i);
            }else System.out.println("This number is odd and number is " + i);

            i++;
        }while(i <= 100);
    }
}
