package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        //Tam Sayılar
        byte byteDeger=7; // -128 ile 127 arasında ki sayılar
        short shortDeger=1645; // -3200 ile 3200 arası
        int intDeger=250000;
        long longDeger=2302161235152325L; //-32k ile 32 k arasında..NOT!!! Sonuna L konmalı

        //Ondalıklı Sayılar
        double doubleDeger=3.1454526251; //noktadan sonra 16 hane tutar
        float floatDeger=3.144523F; //noktadan sonra 7 hane tutar NOT!! sonuna F konur

        //karakter ve karakterler
        char basHarf='A'; //bir tane harf tutar
        String isim="Ümit"; //kelime veya cümle tutabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

    }
}
