package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int [][] tablo = {
                {3,4,55},
                {234,22,33}
        }; // 2 satir 3 sutun

        System.out.println("satir uzunlugu = " + tablo.length); // 2 // satir sayisi
        System.out.println("0. satirin sutun uzunlugu = " + tablo[0].length);   // 3 , sutun uzunlugu
        System.out.println("1. satirin oda sayisi = " + tablo[1].length);  // 3, sutun uzunlugu

        for (int i = 0; i < tablo.length; i++) {

            // ilgili satirdaki sutun uzunlugu
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
