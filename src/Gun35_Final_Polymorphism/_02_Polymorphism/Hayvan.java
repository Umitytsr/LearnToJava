package Gun35_Final_Polymorphism._02_Polymorphism;

public class Hayvan {
    private String name;

    public void ses(){
        System.out.println("Ses çıkardı");
    }

    public Hayvan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
