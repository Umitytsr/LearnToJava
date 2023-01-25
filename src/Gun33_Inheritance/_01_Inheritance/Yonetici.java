package Gun33._01_Ornek;

public class Yonetici {
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String departman;
    private String sicilNo;
    private String telefon;
    private String tcNo;

    public void bordroYazdir() {
        System.out.println("Bordro Yazıldı");
    }

    public void zamYap() {
        System.out.println("Zam Yapıldı");
    }

    // Personel class'ıyla aynı özellikleri taşıyo
    // Üsttekileri yazmamız saçma oldu bu yüzden.
    // Bunun kolay yolu YoneticiYeni class'ında.
}
