package Gun36_Interface._05_Interface;

public class Test implements IYazdirir,IGosterir {
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("Yazdı");
    }
}
