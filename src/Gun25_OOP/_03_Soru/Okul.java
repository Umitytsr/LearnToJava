package Gun25_OOP._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Okul numarası:");    ogr.okulNo=okuInt.nextInt();
            System.out.print("Öğrenci ad-soyad:"); ogr.tamAdi=okuStr.nextLine();
            System.out.print("Notu:");             ogr.notu=okuInt.nextInt();

            snf.add(ogr);
        }
        ogrencilerYazma(snf);
        notOrtalamasi(snf);
    }

    public static void ogrencilerYazma(ArrayList<Ogrenci> snf){
        for (Ogrenci ogr:snf) {
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }

    public static void notOrtalamasi(ArrayList<Ogrenci> snf){
        int toplam=0;
        for (Ogrenci ogr:snf) {
            toplam+= ogr.notu;
        }
        int ortalama=toplam/ snf.size();
        System.out.println("ortalama = " + ortalama);
    }
}
