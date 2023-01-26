package Gun09_If;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //Girilen iki sayıdan büyük olanın değerini ekrana yazdırınız
        //eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int sayi1= oku.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2){
            System.out.println("1.sayı daha büyüktür");
        }
        if (sayi1==sayi2){
            System.out.println("Eşittir");
        }
        if (sayi1<sayi2){
            System.out.println("2.sayı daha büyüktür");
        }
    }
}