package Gun32_Encapsulation._01_Encapsulation;

public class Kisi {
    private String ad; // 25 karakter olsun
    private String soyad;
    private int yas; // korumaya aldım

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    int yasVer(){
        return this.yas;
    }

    void yasAta(int yas){
        if (yas>0 && yas<150){
            this.yas=yas;
        } else{
            System.out.println("Hatalı yaş");
        }
    }

    void setAd(String ad){
        if (ad.length()<25){
            this.ad=ad;
        }else{
            System.out.println("Hatalı ad");
        }
    }

    void setSoyad(String soyad){
        if (soyad.length()<25){
            this.soyad=soyad;
        }else{
            System.out.println("Hatalı soyad");
        }
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }
}
