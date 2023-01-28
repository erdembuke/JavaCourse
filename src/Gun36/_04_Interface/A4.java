package Gun36._04_Interface;

// 1 class 1 den fazla interface implemente edebilir
public class A4 implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdirdi");
    }
}
