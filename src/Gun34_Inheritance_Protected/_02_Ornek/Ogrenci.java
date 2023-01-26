package Gun34_Inheritance_Protected._02_Ornek;

public class Ogrenci {
    private final int ID;
    private String isim;
    private OgrTip tipi;

    private static int IDSayac=1;

    public Ogrenci(String isim, OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.ID=IDSayac++;
    }

    public int getID() {
        return ID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
