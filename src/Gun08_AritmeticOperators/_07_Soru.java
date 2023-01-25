package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //kullanıcının gireciği 2 sayının birbirine
        // eşit mi olup olmadığını kontrol ediniz

        Scanner okuInt=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a=okuInt.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int b=okuInt.nextInt();
        System.out.println("Girilen 2 sayı eşit mi = " +(a==b));

        //2. Yöntem
        boolean esitMi= (a==b);
        System.out.println("esitMi = " + esitMi);


    }
}
