package Gun38_Abstract._003_Abstract;

public abstract class Food {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String madeIn();
    abstract String taste();


    @Override
    public String toString() {
        return  "name: "+name + "\n" +
                "Ait olduğu ülke: "+madeIn()+ "\n" +
                "Tadı: " +taste();
    }
}
