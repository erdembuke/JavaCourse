package Gun47;

public class S24 {
    public static void main(String[] args) {
        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        // hangisi red:blue:small:medium yazar
        // cevap :
        for (String[] c : shirts) {
            for (String a : c) {
                System.out.print(a + ":");
            }
        }
    }
}
