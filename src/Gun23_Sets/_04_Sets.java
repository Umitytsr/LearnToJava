package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        //Uzunluğu
        System.out.println("hs.size() = " + hs.size());

        //eleman silme
            //index'e göre değil 5 değeri olan elemanı siler
        hs.remove(5);
        System.out.println("remove sonrası hs = " + hs);

        //Contains : bu eleman var mı diye kontrol eder
        if (hs.contains(7)){
            System.out.println("var");
        }

        //tüm elemanları silme
        hs.clear();
        System.out.println("hs = " + hs);

    }
}
