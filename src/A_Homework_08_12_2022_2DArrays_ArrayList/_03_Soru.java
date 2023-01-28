package A_Homework_08_12_2022_2DArrays_ArrayList;

public class _03_Soru {
    public static void main(String[] args) {
        /*
            3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.

            [{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"} , {"ohio","new york"}]

            Butun ohio lari Florida ile degistirin ve Array ' i yazdirin.
        */

        String[][] dizi = { {"new jersey" , "atlanta" , "ohio"} , {"Pittshburgh" , "ohio" , "new york" , "ohio"} ,
                {"ohio" , "new york"} };

        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(i + " index kodlu satirdaki elemanlar -> ");
            for (int j = 0; j <dizi[i].length; j++) {

                if(dizi[i][j].equals("ohio"))
                    dizi[i][j] = "Florida";
                System.out.print(dizi[i][j] + "\t");

            }
            System.out.println();
        }


    }
}
