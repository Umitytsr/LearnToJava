package Gun22_2DArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //ArrayList Collection grubunun bir elemanı
        //Array'i sıralarken Arrays.sort'u kullandığımız gibi
        //ArrayList'i Collection metodunu kullanırız

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //sıralama işlemi(küçükten büyüğe)
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine çevirme(büyükten küçüğe)
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max-min elemanları bulma
        System.out.println("max = " + Collections.max(sayilar));//max'ı verir
        System.out.println("min = " + Collections.min(sayilar));//min'i verir

        //Bütün elemanlara belli bir değer atama
        Collections.fill(sayilar,0); //Tüm değerler 0(sıfır) olur.
        System.out.println("sayilar = " + sayilar);

        //replaceAll
        Collections.replaceAll(sayilar,0,5);//tüm sıfırları beş yapar.
        System.out.println("sayilar = " + sayilar);

        //Tanımlarken değer atama
        ArrayList<Integer> intList=new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> strList=new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra"));
        System.out.println("intList = " + intList);
        System.out.println("strList = " + strList);

          //2.Yöntem
        ArrayList<Integer> intList2=new ArrayList<>();
        Collections.addAll(intList2,  2,3,4,5,6 );

        //Diziyi direkt ArrayList'e atama işlemi
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> intList3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("intList3 = " + intList3);




    }
}
