package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _06_Soru {
    public static void main(String[] args) {
        // 0 ile 100 arasindaki hem 5 e hem de 4 e bölünebilen bütün sayilari yazdiriniz
        // sonuc bu sekilde olmalidir
        // 0
        // 20
        // 40
        // 60
        // 80
        // 100

        int i = 0;

        do {
            if (i % 4 == 0 && i % 5 == 0)
                System.out.println(i);
            i++;
        }while (i <= 100);
    }
}
