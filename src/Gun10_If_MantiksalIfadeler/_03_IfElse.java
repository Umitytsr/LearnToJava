package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //girilen bir sayı tek mi çift mi kontrol et

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi%2 ==0){
            System.out.println("Çift");
        }else {
            System.out.println("tek");
        }
    }
}
