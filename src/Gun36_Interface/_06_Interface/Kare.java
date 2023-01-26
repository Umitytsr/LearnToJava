package Gun36_Interface._06_Interface;

public class Kare implements I{
    private int a;

    public Kare(int a) {
        setA(a);

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    @Override
    public void alani() {
        int alan=getA()*getA();
        System.out.println("alan = " + alan);
    }

    @Override
    public void cevresi() {
        int cevre=4*getA();
        System.out.println("cevre = " + cevre);
    }
}
