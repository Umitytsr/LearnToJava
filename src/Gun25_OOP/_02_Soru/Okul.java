package Gun25_OOP._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
/*
        Ogrenci ogr1=new Ogrenci();
        System.out.print("Öğrenci adı:");    ogr1.adi=okuStr.nextLine();
        System.out.print("Öğrenci soyadı:"); ogr1.soyadi=okuStr.nextLine();
        System.out.print("Öğrenci sinifi:"); ogr1.sinifi=okuInt.nextInt();
        System.out.print("Öğrenci adresi:"); ogr1.adres=okuStr.nextLine();

        Ogrenci ogr2=new Ogrenci();
        System.out.print("Öğrenci adı:");    ogr2.adi=okuStr.nextLine();
        System.out.print("Öğrenci soyadı:"); ogr2.soyadi=okuStr.nextLine();
        System.out.print("Öğrenci sinifi:"); ogr2.sinifi=okuInt.nextInt();
        System.out.print("Öğrenci adresi:"); ogr2.adres=okuStr.nextLine();

        Ogrenci ogr3=new Ogrenci();
        System.out.print("Öğrenci adı:");    ogr3.adi=okuStr.nextLine();
        System.out.print("Öğrenci soyadı:"); ogr3.soyadi=okuStr.nextLine();
        System.out.print("Öğrenci sinifi:"); ogr3.sinifi=okuInt.nextInt();
        System.out.print("Öğrenci adresi:"); ogr3.adres=okuStr.nextLine();
 */

        //Yukarıda ki yol çok uzun. ya 50 bin öğrenci olsaydı.Bunun kolayı için
        //ArrayList kullanmamız lazım
            //soru da öğrenci sayısı verdiği için for ile yaptım ama öğrenci
            //sayısı vermese do-while ile yapar her öğrenciden sonra
            //"devam etmek istiyo musun?" diye sorardım.


        ArrayList<Ogrenci> snf=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci adı:");    ogr.adi=okuStr.nextLine();
            System.out.print("Öğrenci soyadı:"); ogr.soyadi=okuStr.nextLine();
            System.out.print("Öğrenci sinifi:"); ogr.sinifi=okuInt.nextInt();
            System.out.print("Öğrenci adresi:"); ogr.adres=okuStr.nextLine();
            
            snf.add(ogr);
        }

        for (Ogrenci ogr : snf) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}

