package Gun35_Final_Polymorphism._01_Final.method;

public class Araclar {
    private String model;


    public Araclar(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
