package Gun37_Interface._01_Soru;

public class Bus extends Vehicle implements IDeisel{

    public Bus(String model, double engine) {
        super(model, engine);
    }


    @Override
    public String changeDeisel() {
        return "Bir depo ile 100km gider";
    }

    @Override
    public String drive() {
        return "En fazla 90km hız yapar";
    }
}
