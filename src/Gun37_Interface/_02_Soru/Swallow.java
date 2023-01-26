package Gun37_Interface._02_Soru;

public class Swallow extends Animal implements IFlaying{
    public Swallow(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "Solucan yer";
    }
}
