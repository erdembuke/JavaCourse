package Gun45;

public class S18_2 {
    public static void main(String[] args) {

        String[][] arr = {  {"A","B","C"}, {"D","E"}  };
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    break;
                }
            }
            continue;   // etkisi yok
            // cunku kendisinden gsonra gelen kod yok
        }
    }
}
// ABDE
