package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); //daha önce Red alındığı için tekrar almaz
        renkler.add("RED");

        //ekrana yazdırma işlemi
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasıl yazdırırım.
        //NOT!! index kavramı yok

        for (String eleman :renkler) { //Sıra garanti değil.sadece elemanları verir
            System.out.println("eleman = " + eleman);
        }


        //İndex kavramı olmadığı için iterator'le yapılır.
        //Aklında itmek aklamı olsun.
        //Set'in kendi sırası nasılsa onun aynısını verir.
        Iterator gosterge= renkler.iterator();
        
        while (gosterge.hasNext()){//has.Next() sırada ki eleman var ise
            System.out.println("gosterdiği eleman = " + gosterge.next());
            //.next() göstergenin gösterdiği elemanı temsil eder.
        }


    }
}
