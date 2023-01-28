package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _03_Soru {
    public static void main(String[] args) {
        // 100 den 0 a kadar bütün tek sayilari yazdirin
        int i = 100;

        System.out.println("100 den baslayip 0 a kadar olan tek sayilar");

        do {
            if (i % 2 != 0)
                System.out.println(i);
            i--;
        }while(i > 0);
    }
}
