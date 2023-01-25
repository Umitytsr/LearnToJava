package Gun24_Map;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        //NOT!! anahtar dediğimi şeyi index gibi düşün

        // anahtarın tipi Integer, değerinin tipi String olsun
                //key   ,  value
        HashMap< Integer,  String> hm=new HashMap<>();
        
        //ekleme
        hm.put(1001,"İsmet Temur");
        hm.put(1002,"Cihat Yılmaz");
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");

        //yazdırma
        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));
        
        //Contains ->VAR MI YOK MU?
        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));//true
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));//false

        //Sadece key(anahtarlarını) alma
        System.out.println("hm.keySet() = " + hm.keySet());
        
        //Sadece value(değerlerini) alma
        System.out.println("hm.values() = " + hm.values());
        
        //kaldırma işlemi-> .remove
        hm.remove(5001);
        System.out.println("hm = " + hm);
        //NOT!!key'den remove yapar
        
        //uzunluk
        System.out.println("hm.size() = " + hm.size());

        //tüm listeyi temizleme
        hm.clear();
        System.out.println("hm = " + hm);


        
    }
}
