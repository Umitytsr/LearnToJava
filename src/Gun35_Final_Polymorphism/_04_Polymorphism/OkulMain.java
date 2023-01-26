package Gun35_Final_Polymorphism._04_Polymorphism;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("ümit","yetişir","öğrenci","5/A");
        Calisan cal=new Calisan("Ali","yılmaz","yazılım","BİM");

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);
    }
}
