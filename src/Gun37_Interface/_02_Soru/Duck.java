package Gun37_Interface._02_Soru;

public class Duck extends Animal implements IAnimal,ISailing{
    public Duck(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "Balık yer";
    }
}
