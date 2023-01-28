package Gun37._01_Ornek;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "Auto-Pilot activated";
    }

    @Override
    public String changeBattery() {
        return "27.520 km left to battery change..";
    }

    @Override
    public String toString() {
        return drive() + " / " + changeBattery();
    }
}
