package Gun44;

public class S24 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;

        for (String s : strs) {
            strs[idx].concat("element" + idx); // eleman atanmadigi (null) oldugu icin null a concat yapilmaz hata verir
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
