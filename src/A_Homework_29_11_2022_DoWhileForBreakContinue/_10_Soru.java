package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _10_Soru {
    public static void main(String[] args) {
        // do while loop kullanin.
        // 0 ile 30 arasindaki bütün cift sayilari yazdirin.

        int i = 0;
        System.out.println("0 ile 30 arasindaki cift sayilar ");

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }while (i <=30);
    }
}
