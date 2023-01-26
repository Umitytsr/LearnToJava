package Gun19_2DArray_Method;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        //kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        //dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+".sayı=");
            dizi[i]= oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);
    }

    public static void enKucukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("en küçük = " + sayilar[0]);
    }

    public static void  enBuyukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("en büyük= " +sayilar[sayilar.length-1]);
    }

    public static void ortalamaYaz(int[] sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        int ortalama=toplam/ sayilar.length;
        System.out.println("ortalama = " + ortalama);
    }
}
