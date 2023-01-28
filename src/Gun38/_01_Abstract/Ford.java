package Gun38._01_Abstract;

public class Ford extends BinekOto{

    public Ford(String brand, int productionYear, int producitonAmount) {
        super(brand, productionYear, producitonAmount);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}
