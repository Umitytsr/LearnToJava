package Gun16_Array;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        //kaç tanesinin ortalamadan büyük ve tek sayı oldugunu bulunuz

        int[] sayi=new int[7];
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < sayi.length ; i++) {
            System.out.print((i+1)+".Sayı giriniz:");
            sayi[i]= oku.nextInt();
            toplam+=sayi[i];
        }
        int miktar=0;
        int ort=toplam/sayi.length;
        for (int i = 0; i < sayi.length; i++) {
            if(ort<sayi[i] && sayi[i]%2!=0){
                System.out.println((i+1)+".not:"+sayi[i]);
                miktar++;
            }
        }
        System.out.println("miktar = " + miktar);
        System.out.println("ortalama="+ort);
    }
}
