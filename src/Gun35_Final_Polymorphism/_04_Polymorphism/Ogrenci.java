package Gun35_Final_Polymorphism._03_Polymorphism;

public class Ogrenci extends Kisi{
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                "} " + super.toString();
    }
}
