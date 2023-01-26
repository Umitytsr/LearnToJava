package Gun35_Final_Polymorphism._01_Final.method;

public class Ucak extends Araclar{

    public Ucak(String model) {
        super(model);
    }

    /*
    public final String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
     */

    // Başka yerden kalıtım aldığı için, ve kalıtım aldığı
    // metop final old. için değiştirilmez
}
