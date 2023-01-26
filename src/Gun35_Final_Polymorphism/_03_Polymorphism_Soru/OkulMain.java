package Gun35_Final_Polymorphism._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("Ümit","Yetişir","Öğrenci","5A");
        Calisan cal=new Calisan("İsmet","Temur","Yazılım","BIM");

        Kisi.kimlikBelgesiYaz(ogr);
        Kisi.kimlikBelgesiYaz(cal);
    }
}
