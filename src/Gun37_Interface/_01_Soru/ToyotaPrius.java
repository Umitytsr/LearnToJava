package Gun37_Interface._01_Soru;

public class ToyotaPrius extends Vehicle implements IElektric,IGaz{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo yağ ile 300km gider";
    }

    @Override
    public String drive() {
        return "İlk 3 km elektrik ile gider";
    }
}
