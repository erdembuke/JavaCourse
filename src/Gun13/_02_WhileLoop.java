package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdirin.

        int sayac = 1;
        while(sayac < 6)     // sarti yaziyoruz,donme sarti
        {
            // her dondukce yapilcaklar (tekrarlanacak adımlar buraya yaziliyor
            System.out.println(sayac + ".Hello TechnoStudy");

            sayac++;
        }

        System.out.println("The end");

    }
}
