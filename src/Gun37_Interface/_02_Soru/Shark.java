package Gun37_Interface._02_Soru;

public class Shark extends Animal implements ISailing{
    public Shark(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "İnsan bile yiyebilir. DİKKAT ETT!!!";
    }
}
