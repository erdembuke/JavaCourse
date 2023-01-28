package Gun31._04_EnumSoru;

public enum Pizza {
    SMALL(55,20),
    MEDIUM(87,30),
    LARGE(125,40);

    final int price;
    final int cm;

    Pizza(int price, int cm) {
        this.price = price;
        this.cm = cm;
    }
}
