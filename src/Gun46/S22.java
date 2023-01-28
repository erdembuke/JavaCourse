package Gun46;

public class S22 {
    public static void main(String[] args) {

        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
        

        //----------------------------------//
        System.out.println("chs.length = " + chs.length); // satir sayisi -> 5
        System.out.println("chs[0].length = " + chs[0].length); // 0. satir uzunlugu -> 2
        System.out.println("chs[1].length = " + chs[1].length); // 1. satir uzunlugu -> 5
        System.out.println("chs[2].length = " + chs[2].length); // 2. satir uzunlugu -> 2
    }
}
