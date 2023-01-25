package Gun32._02_Encapsulation;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba(){

    }

    //ArabaMain class'ında başına * koyduğum satırın kontrolü altta ki metodla yapılır
    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
        setRenk(renk);
        setModel(model);
        setKapiSayisi(kapiSayisi);
        setMotorHacmi(motorHacmi);
    }

    void setRenk(String renk){
        if (renk.equalsIgnoreCase("kırmızı")
        || renk.equalsIgnoreCase("beyaz")
        || renk.equalsIgnoreCase("mavi")){
            this.renk=renk;
        }else {
            System.out.println("Hatalı renk");
        }
    }

    void  setModel(int model){
        if (model<2023){
            this.model=model;
        }else {
            System.out.println("Hatalı model");
        }
    }

    void  setMotorHacmi(double motorHacmi){
        if (0<motorHacmi && motorHacmi<8000){
            this.motorHacmi=motorHacmi;
        }else {
            System.out.println("Hatalı motor hacmi");
        }
    }

    void setKapiSayisi(int kapiSayisi){
        if (1<kapiSayisi && kapiSayisi<6){
            this.kapiSayisi=kapiSayisi;
        }else {
            System.out.println("Hatalı kapı sayısı");
        }
    }

    public String getRenk() {
        return renk;
    }

    public int getModel() {
        return model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
