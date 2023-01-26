package Gun30_Final._01_StaticVariables._Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım İlkokulu";
    //sen bitanesin
    //hepsi için geçerli tek bir eleman
    //Tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz
    //static=sen bitanesin
    //static varsa hafızadan tasarruf sağlar.
    //hepsine atanır, tek olarak hafızada bulunur.
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                "okul ad='" + okulAd + '\'' +
                '}';
    }
}
