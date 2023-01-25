package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        
        //1.YOL
        Ogrenci ogr1=new Ogrenci(); //nesne oluşma anı

        ogr1.id=1; //özelliklerinin değerlerini veriyorum
        ogr1.ad="Ümit";
        ogr1.soyad="Yetişir";
        ogr1.sinifi=1;
        System.out.println("ogr1.ad = " + ogr1.ad);

        //2.YOL
        Ogrenci ogr2=new Ogrenci(2,"İsmet","Temur",2);
        System.out.println("ogr2.ad= " +ogr2.ad);

        //3.YOL ->aslında ikinci yolla aynı sadece kısaltılmış hali.
        Ogrenci ogr3=new Ogrenci(3,"kadir","Aslan");

    }
}
