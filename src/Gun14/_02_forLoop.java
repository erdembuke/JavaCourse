package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 dan 5 e kadar olan sayilari ekrana yazdirinız.

        // dongunu kac kere doncegi belli olmayan durumlarda kullanacagiz
        int i = 1;
        while (i <= 5) {
            System.out.println("while_i = " + i);
            i++;
        }

        // for döngüsü, başı belli sonu belli , artışı belli ise
        for (i=1; i<=5; i++)
            System.out.println("for_i = " + i);

        // basi belli sonu belli yani kac adim donecegi belli ve artis miktari belli ise bu FOR döngüsü

        // kac kere donecegi belli degil ise ( kullanici 0 degeri girene kadar ) WHILE dongusu

        // while dongusunde döngü kontrolü islemden sonra ise DO-WHILE dongusu
    }
}
