package Gun42;

import java.util.Arrays;

public class _03_VeriTiplerMetodda {
    public static void main(String[] args) {
        // İlkel Tip
        int sayi=5;
        sayiArttir(sayi);
        System.out.println("sayi = " + sayi); //5

        // Referans Tip
        int[] dizi={1,2,3};
        diziyiSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));

        // Nesne Tipler
        String kelime="İsmet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara
        //    sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri
        //    alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri
        //    giderler. Eşitlemelerde referanslar eşitlenir.
    }

    public static void sayiArttir(int sayi){ // ilkel değerlerin değeri gelir
        sayi++; //6
    }

    public static void diziyiSifirla(int[] dizi){ // referans değerlerin kendisi gelir
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
    }

    public static void kelimeSifirla(String kelime){ // ilkel tip gibi davrandığı için değeri gider
        kelime="";
    }
}
