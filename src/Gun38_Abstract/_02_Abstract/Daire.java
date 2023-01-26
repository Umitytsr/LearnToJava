package Gun38_Abstract._02_Abstract;

public class Daire extends Sekil{

    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    double Alan() {
        return Math.PI*getYariCap()*getYariCap();
    }

    @Override
    double Cevre() {
        return 2*Math.PI*getYariCap();
    }
}
