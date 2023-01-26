package Gun23_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS
        //HashSet : Hızlı,bunun için kendine göre algoritmik sıra tutar.
        //LinkedHashSet : EKLEME SIRASI'na göre tutar
        //TreeSet : kendinden sortlu yani küçükten büyüğe veya alfabetik sırayla tutar

        //Hızlı, bunun yüzünden kendine göre algoritmik sırada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        //eklenme sırasına göre
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //alfabetik
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

    }
}
