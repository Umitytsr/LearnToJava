package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Girilen bir adı ve soyadı "Ümit Yetişir"
        //Ü.T. şeklinde yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("adınız ve soyadınızı giriniz:");
        String adSoyad=oku.nextLine();
        int a=adSoyad.indexOf(" ");

        System.out.println("kısaltma = " +adSoyad.charAt(0)+"."+adSoyad.charAt(a+1));

        //veya
        System.out.print("adınız ve soyadınızı giriniz:");
        String adSoyad2=oku.nextLine();

        char ilkHarf=adSoyad2.charAt(0);
        int boslukIndex=adSoyad2.indexOf(" ");
        char soyadIlkHarf=adSoyad2.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf);

    }
}
