package Gun35_Final_Polymorphism._03_Polymorphism_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public static void kimlikBelgesiYaz(Kisi kisi){

        System.out.print(kisi.getAd()+" "
                +kisi.getSoyad()+"\n"
                +kisi.getGorevi()+" ");

        if (kisi instanceof Ogrenci){
            System.out.println(((Ogrenci) kisi).getSubesi());
        } else if (kisi instanceof Calisan) {
            System.out.println(((Calisan)kisi).getDepartmani());
        }
        System.out.println("*********");
    }

}
