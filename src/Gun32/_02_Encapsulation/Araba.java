package Gun32._02_Encapsulation;

public class Araba {
    private String color;
    private int model;
    private int engineCC;
    private int doorAmount;

    public Araba() {
    }

    public Araba(String color, int model, int engineCC, int doorAmount) {
        setColor(color);
        setModel(model);
        setEngineCC(engineCC);
        setDoorAmount(doorAmount);
    }

    void setColor(String color) {
        if (color.length() < 20) {
            this.color = color;
        }else System.out.println("Hatali renk");
    }

    String getColor(){
        return this.color;
    }

    void setModel(int model) {
        if(model < 2024 && model > 1900) {
            this.model = model;
        }else System.out.println("Gecersiz model");
    }

    int getModel() {
        return this.model;
    }

    void setEngineCC(int engineCC) {
        if (engineCC < 7000 && engineCC >= 899) {
            this.engineCC = engineCC;
        }
    }

    int getEngineCC() {
        return this.engineCC;
    }

    void setDoorAmount(int doorAmount) {
        if (doorAmount <= 6 && doorAmount >=3 ) {
            this.doorAmount = doorAmount;
        }
    }

    int getDoorAmount() {
        return this.doorAmount;
    }


    public String toString() {
        return color + " color / "
                + model + " model / "
                + engineCC + " cc engine / "
                + doorAmount + " doors";
    }
}
