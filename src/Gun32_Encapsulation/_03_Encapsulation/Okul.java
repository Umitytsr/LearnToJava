package Gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontenjan;
    private ArrayList<Ogrenci> ogr=new ArrayList<>();

    public Okul() {
    }

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgr() {
        return ogr;
    }

    public void setOgr(ArrayList<Ogrenci> ogr) {

        this.ogr = ogr;

    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogr=" + ogr +
                '}';
    }
}
