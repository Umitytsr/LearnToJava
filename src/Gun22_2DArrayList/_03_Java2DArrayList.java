package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
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

        //1-Notları ekrana ders adlarını bir ArrayList'ten alarak her dersin
        //  adını ve notlarını her bir satıra yazdırınız.
        // Matematik : 60 70 80
        // Fizik : 30 40
        // Kimya: 60 70 80 90

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }

            System.out.println();

        }

        //2-kullanıcıdan istediği bir dersin nosunu alarak
        //  (0-mat, 1-fizik, 2-kimya) sadece istediği derse ait notları
        //  bir metodda yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sitediğiniz dersin numarasını giriniz(0-mat, 1-fizik, 2-kimya):");
        int ders= oku.nextInt();
        istenilenDers(notlarListesi,ders,dersler);


        //3-yukarıda verilen derse ait not ortalamasını ve geçen sayısını
        //  bir metodda yazdırınız.

        notOrtalamasi(notlarListesi,ders);


    }

    public static void istenilenDers(ArrayList< ArrayList<Integer>  > notlarListesi,
                                     int ders,ArrayList<String> dersler){
        System.out.print(dersler.get(ders)+" : ");
        for (int i = 0; i < notlarListesi.get(ders).size(); i++) {
            System.out.print(notlarListesi.get(ders).get(i)+"\t");
        }
        System.out.println();

    }

    public static void notOrtalamasi(ArrayList< ArrayList<Integer>  > notlarListesi,int ders){
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(ders).size(); i++) {
            toplam+=notlarListesi.get(ders).get(i);
        }
        int ortalama=toplam/notlarListesi.get(ders).size();
        System.out.println("ortalama = " + ortalama);

        int gecenMiktar=0;
        for (int i = 0; i < notlarListesi.get(ders).size(); i++) {
            if (ortalama>notlarListesi.get(ders).get(i)){
                gecenMiktar++;
            }
        }
        System.out.println("gecenMiktar = " + gecenMiktar);
    }
}
