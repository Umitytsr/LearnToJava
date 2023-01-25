package Gun34._03_Protected.Paket1;

public class P1Hayvan {
    public String ad;       // her paketten, her yerden
    int yas;                // sadece bulunduğu pakettekiler
    protected String cinsi; // default gibi, diğer paketle erişimle ilgili bir seçeneği var
    private String renk;    // sadece kendi class'ı
}
