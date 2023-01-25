package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //Girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner okuInt=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a=okuInt.nextInt();
        System.out.println("Girilen sayı tek mi? = " + (1==(a%2)));

        //2. yöntem
        System.out.println("a%2 !=0 = " + (a%2 !=0));
        //NOT!! kullanıcı negatif sayı girerse 1 yerine -1 olacağı için
        //çifte göre yapmak daha mantıklıdır
    }
}
