package Gun30_Final._01_StaticVariables._Ornek1;

public class Okul {
    public static void main(String[] args) {
//        Ogrenci ogr1=new Ogrenci("İsmet","Temur","Yıldırım İlkokulu");
//        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım İlkokulu");
//        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım İlkokulu");



        //...
        //...
//        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım İlkokulu");
//        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım İlkokulu");


        Ogrenci ogr1=new Ogrenci("İsmet","Temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk İlkokulu";
        //Tüm öğrencilerin okulu Yıldırımdan Atatürk'e dönüştü.
        System.out.println("ogr1 = " + ogr1);

        Ogrenci ogr2=new Ogrenci("Ümit","Yetişir");
        System.out.println("ogr2 = " + ogr2);

    }
}
