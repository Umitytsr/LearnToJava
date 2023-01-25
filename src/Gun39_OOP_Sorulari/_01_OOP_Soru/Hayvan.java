package Gun39._01_OOP_Soru;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();

    abstract void yemekMiktari();

    abstract void gunlukUykuSuresi();

    abstract void sesi();

    private static int sayac=1;


    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=sayac++;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("Yiyeceği: "); yiyecegi();
        System.out.print("Yemek miktarı: "); yemekMiktari();
        System.out.print("Uyku süresi: "); gunlukUykuSuresi();
        System.out.print("Sesi: "); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +

                '}';


    }
}
