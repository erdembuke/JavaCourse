package Gun37._01_Ornek;

public class ToyotaPrius extends Vehicle implements IElectric,Gas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeOil() {
        return "2300km left to oil change";
    }

    @Override
    public String changeBattery() {
        return "27.520 km left to battery change..";
    }

    @Override
    public String drive() {
        return "Using battery until 20 mph";
    }

    @Override
    public String toString() {
        return drive() + " / " + changeBattery() + " / " + changeOil();
    }
}
