package Gun16_Array;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        //kaç not old. bulunuz ve bunları yazdırınız

        Scanner oku=new Scanner(System.in);
        int[] notlar=new int[50];
        int toplam=0;
        for (int i=0;i<notlar.length;i++){
            System.out.print("Notu giriniz:");
            notlar[i]= oku.nextInt();
            toplam+=notlar[i];
        }
        int ortalama=toplam/notlar.length;

        for (int i=0;i<5;i++){
            if (ortalama<notlar[i]){
                System.out.println((i+1)+".not = " + notlar[i]);
            }
        }
        System.out.println("ortalama = " + ortalama);
    }
}
