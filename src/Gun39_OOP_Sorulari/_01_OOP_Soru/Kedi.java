package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Yaş mama ve balık yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Günde içinde ortalama 400gr yer ");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Ortalama 8 ila 12 saat arası uyur.");
    }

    @Override
    void sesi() {
        System.out.println("Miyavlar");
    }
}
