package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElektric{

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatery() {
        return "Bataryanın 9 yıl ömrü var";
    }

    @Override
    public String drive() {
        return "Auto pilot özelliği var";
    }
}
