package Gun33._02_Ornek;

public class Hayvan {
    private String renk;
    private int kilo;
    private String cinsi;

    public void konustu(){
        System.out.println("Ses çıkardı");
    }

    public Hayvan(String renk, int kilo, String cinsi) {
        setRenk(renk);
        setKilo(kilo);
        setCinsi(cinsi);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
