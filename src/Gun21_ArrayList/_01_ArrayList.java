package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        //dizi, array: boyut sayısı belli, sonradan çalışmaz
        int[] dizi=new int[5];//Array 5 elemanlı boyutu sonradan değiştirilemiyor.

        //ArrayList normal arraylere göre daha yavaş çalışır.
        //ArrayList: boyutunu başta vermeye gerek yok. eleman ekleme çıkarma yapılır.
        //           uzunlukları başta sıfırdır.eleman ekledikçe artar,sildikçe azalır.

        //Tanımlaması ->
        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();

        //listeyi yazdırma
        System.out.println("isimler = " + isimler);

        //ekleme-> .add
        isimler.add("ümit"); //uzunluk 1
        isimler.add("metin"); //uzunluk 2
        isimler.add("hacer"); //uzunluk 3
        isimler.add("aynur"); //uzunluk4
        System.out.println("isimler = " + isimler);

        //uzunluk-> .size
        System.out.println("isimler.size = " + isimler.size());

        //araya eleman ekleme
        isimler.add(1,"muhammet"); //elemanı 1. index'e ekler. Diğerleri sıra kayar.
        System.out.println("isimler = " + isimler);

        //eleman değiştirme
        isimler.set(1,"zafer");//eleman kaydırmaz, eskisini silip yenisini ekler
        System.out.println("isimler = " + isimler);

        //var mı yok mu (contains-stringde ki gibi çalışır)
        boolean varMi= isimler.contains("metin");
        System.out.println("varMi = " + varMi);//true

        //silme-> .remove
        isimler.remove("metin"); //değere göre siler
        System.out.println("isimler = " + isimler);
        isimler.remove(1); //index'e göre siler
            //NOT! ilk "metin" değerini siler. tüm metin değerlerini silmek için for döngüsüne al
        System.out.println("isimler = " + isimler);

        //NOT!!! şuan listemiz String. Eğer biz int listesi oluşturup içine eleman olarak 1 atsaydık
        //       ve isimler.remove(1) deseydik 1 numaralı index'i silerdi. eleman olan 1'i silmek için
        //       isimler.remove((object)1) yazmamız lazım. ÖRNEK->
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(15);//0. index
        sayilar.add(25);//1. index
        sayilar.add(1); //2. index
        System.out.println("sayilar = " + sayilar);//[15,25,1]
        sayilar.remove(1);//25 1. index olduğu için 25'i siler
        System.out.println("sayilar = " + sayilar);//[15,1]
        sayilar.remove((Object)1);//eleman olan 1'i siler.
        System.out.println("sayilar = " + sayilar);//[15]

        //index
        int indexOfAynur= isimler.indexOf("aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);

        //chatAt
        String ilkEleman=isimler.get(0);
        System.out.println("ilkEleman = " + ilkEleman);

        //Her şeyi silme
        isimler.clear();
        System.out.println("isimler = " + isimler);

    }
}
