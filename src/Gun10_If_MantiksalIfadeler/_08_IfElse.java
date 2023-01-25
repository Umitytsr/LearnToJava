package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        //yan yana aralarında bir boşluk girilen 3 int sayının
        //toplamlarının sonuncunun tek mi çift mi olduğunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Aralarında boşluk bırakarak 3 sayı giriniz:");
        String sayilar= oku.nextLine();
        int bosluk1=sayilar.indexOf(" ");
        int bosluk2=sayilar.lastIndexOf(" ");

        String sayi1=sayilar.substring(0,bosluk1);
        int sayi1Donustu=Integer.parseInt(sayi1);

        String sayi2=sayilar.substring(bosluk1+1,bosluk2);
        int sayi2Donustu=Integer.parseInt(sayi2);

        String sayi3=sayilar.substring(bosluk2+1);
        int sayi3Donustu=Integer.parseInt(sayi3);

        if ((sayi1Donustu+sayi2Donustu+sayi3Donustu)%2 == 0){
            System.out.println("Çift");
        }else {
            System.out.println("Tek");
        }

        //HATIRLATMA!!
        // int bosluk2=sayilar.indexOf(" ",bosluk1+1); -> Bu FROMİNDEX'tir.2. boşluğu aramaya verilen yerden başlar.


    }
}
