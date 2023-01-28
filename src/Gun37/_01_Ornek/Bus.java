package Gun37._01_Ornek;

public class Bus extends Vehicle implements Diesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String fillTank() {
        return "Fueling up..";
    }

    @Override
    public String drive() {
        return "Please put the transmission on Drive mode.";
    }

    @Override
    public String toString() {
        return drive() + " / " + fillTank();
    }
}
