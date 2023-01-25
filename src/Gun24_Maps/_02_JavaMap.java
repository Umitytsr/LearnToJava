package Gun24_Map;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Cihat Yılmaz");
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");

        //ayrı ayrı yazdırma
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer key: hm.keySet() ) {
            System.out.print(key+"\t");
        }
        System.out.println();

        for (String values: hm.values()) {
            System.out.print(values+"\t");
        }
        System.out.println();

        //Beraber yazdırma
        for (Map.Entry<Integer,String> keyValue:hm.entrySet()) {
            //Map.Entry -> varlık manasında kullanılır.
            System.out.println(keyValue.getKey()+"-"+keyValue.getValue());
        }




    }
}
