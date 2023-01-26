package Gun05_Scanner;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        //Kullanıcı adını soyadını ekrana yazdırınız.

        String adSoyad="";
        System.out.print("Ad ve soyadınızı giriniz:");
        Scanner oku=new Scanner(System.in);
        adSoyad=oku.nextLine();
        System.out.println("AD SOYAD = " + adSoyad);

        //veya

        Scanner oku2=new Scanner(System.in);
        System.out.print("Ad ve soyadınızı giriniz:");
        String adSoyad2=oku2.nextLine();
        System.out.println("ad soyad = " + adSoyad2);


    }
}
