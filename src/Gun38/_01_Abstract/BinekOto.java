package Gun38._01_Abstract;

// 2 si bir arada => 1 interface + 1 parent class = abstract class
public abstract class BinekOto {
    private String brand;
    private int productionYear;
    private int producitonAmount;

    public BinekOto(String brand, int productionYear, int producitonAmount) {
        setBrand(brand);
        setProductionYear(productionYear);
        setProducitonAmount(producitonAmount);
    }

    abstract int hizlanmaSuresi();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProducitonAmount() {
        return producitonAmount;
    }

    public void setProducitonAmount(int producitonAmount) {
        this.producitonAmount = producitonAmount;
    }
}
