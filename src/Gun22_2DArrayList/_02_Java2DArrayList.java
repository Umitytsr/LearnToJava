package Gun22_2DArrayList;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; //tek bir sayı tutabilen bir değişken tipi
        int[] dizi=new int[20]; // 20 adet sayı saklayabilen bir değişken(dizi), uzunluğu sabit
        int[][] tablo=new int[20][2]; //20x2'lik dizi saklayabilen değişken, uzunluğu sabit

        ArrayList<Integer> list=new ArrayList<>();//istediğin kadar say ekleyebildiğin değişken, uzunluğu sabit değil


        //bir sınıf da 20 kişi var ve 3 adet dersleri vardır.
        //öğrencilerin bu 3 derse ait notlarını nasıl bi değişkene sokabiliriz.
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(60);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayList in ArrayList'i nasıl yapılır.
        ArrayList< ArrayList<Integer>  > notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        System.out.println("notlarListesi = " + notlarListesi);

        notlarListesi.get(0);//matN0tlari
        int matBirNot=notlarListesi.get(0).get(0); //matNotlari'nın ilkini alır
        System.out.println("matBirNot = " + matBirNot);

        //yukarıdakinin yerine bir for döngüsü nasıl kullanırız
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi("+i+") = " + notlarListesi.get(i));
        }

        //satır sütun yazdırma
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }




    }
}
