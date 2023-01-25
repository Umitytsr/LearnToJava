package Gun16_Array;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int ogrNot; //hafıza da 1 tane not kaplayacak

        //50 kişi var
        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //...
        //...
        //...
        int ogr50Not;

        //bana bir tanımlamada birden fazla değer tutabilen
        //bir değişkene ihtiyacım var

        //ÇÖZÜM;
        int[] notlar=new int[50]; // 50 tane int saklayabilen notlar isimli değişken

        notlar[0]=75;
        notlar[1]=64;
        //...
        //...
        notlar[49]=95; //index 0(sıfır)'dan başladığı için 49'a kadar gider

        System.out.println("notlar = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length);//50 , yani toplam eleman sayısını verir.

        //dizi nasıl okutulur.
        Scanner oku=new Scanner(System.in);
        for (int i=0;i<notlar.length;i++){
            System.out.print("Notu Giriniz:");
            notlar[i]= oku.nextInt();
        }
        for (int i=0;i<notlar.length;i++){
            System.out.println(notlar[i]);
        }


    }
}
