package Gun37_Interface._02_Soru;

public class Cat extends Animal implements IAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "Yaş mama yer";
    }
}
