package Gun17_Array_Trim_Split;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru_Tam_Cozum {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi 1-10 arası random olarak doldurduktan sonra,
        //kullanıcının gireceği bir rakamı aratınız.
        //bu rakam var ise index'ini yazdırınız.

        int[] dizi=new int[10];
        for (int i = 0; i <10 ; i++) {
            dizi[i]=(int)(Math.random()*10+1);
        }
        //Arrays.sort(dizi); ->sıralamak istersek
        System.out.println("dizi = " + Arrays.toString(dizi));// ->diziyi görmek için yazdım.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();
        boolean a=false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi){
                System.out.println(i+".indexte");
                a=true;
            }
        }
        if (a==false){
            System.out.println("Bulunamadı");
        }
    }
}
