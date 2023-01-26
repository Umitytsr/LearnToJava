package Gun23_Sets;

import java.util.*;

public class _05_Soru {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random 10'a kadar olan sayılarlar
        //doldurduktan sonra, tekrarlı değerleri almayacak şekilde
        //yeni bir diziye atınız.

        ArrayList<Integer> randomSayilar=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rndsayi=(int)(Math.random()*10);
            randomSayilar.add(rndsayi);
        }
        System.out.println("randomSayilar = " + randomSayilar);

        //1.Yöntem
        HashSet<Integer> yeniRndSayilar=new HashSet<>();
        for (int i = 0; i < randomSayilar.size(); i++) {
            yeniRndSayilar.add(randomSayilar.get(i));
        }
        System.out.println("yeniRndSayilar = " + yeniRndSayilar);

        //2.Yöntem
        Integer[] dizi=new Integer[10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int) (Math.random()*10);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        HashSet<Integer> hs=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs);

        //3.Yöntem
        HashSet<Integer> hs2=new HashSet<>();
        Collections.addAll(hs2,dizi);
        System.out.println("hs2 = " + hs2);

    }
}
