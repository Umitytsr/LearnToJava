package Gun36_Interface._06_Interface;

public class Dikdortgen implements I{
    private int a;
    private int b;

    public Dikdortgen(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void alani() {
        int alan=getA()*getB();
        System.out.println("alan = " + alan);
    }

    @Override
    public void cevresi() {
        int cevre=2*getA()+2*getB();
        System.out.println("cevre = " + cevre);
    }
}
