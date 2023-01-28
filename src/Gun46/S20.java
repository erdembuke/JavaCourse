package Gun46;

public class S20 {
    public static void main(String[] args) {

        int[] dizi1 = new int[]{2,5,6,7};
        int[] dizi = {2,5,6,7}; // 4 elemanliydi
        dizi = new int[] {2,3}; // 2 elemanli oldu

        int[][] arr = new int[2][4]; // ikinci kisim (4) ün önemi yok cunku assada yeniden olusturuyor

        arr[0] = new int[] {1,3,5,7};   // satir 0 : bu satiri yeniden olusturuyor
        arr[1] = new int[] {1,3};       // satir 1 : bu satiri yeniden olusturuyor

        for(int[] a : arr) {    // arr satirlardan olusuyor arr[0] arr[1]

            for (int eleman : a) {   // satir int lerden olusuyor
                System.out.print(eleman + " ");
            }

            System.out.println();
        }

    }
}
