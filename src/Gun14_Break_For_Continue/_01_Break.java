package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının çarpımına eşit
        // olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi= oku.nextInt();

        int sayac=0;
        int arananSayi=0;

        while (sayac<sayi){
            if (sayac*sayac == sayi){
                System.out.println(sayi+" tam karedir");
                arananSayi=sayac;
                break; //çalıştığında döngüyü durdurur.yani döngüden çıkar

            }
            sayac++;
        }
        if (arananSayi ==0)
            System.out.println("tam kare değildir");


    }
}
