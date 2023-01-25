package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplam için T, Çıkarma için Ç, çarpma işi P, bölme için B
        // harflerini alarak isteğe uygun işlemi yaptırıp sonucu yazdırınız

        Scanner okuInt=new Scanner(System.in);
        System.out.print("sayi1:");
        int sayi1=okuInt.nextInt();

        System.out.print("sayi2:");
        int sayi2= okuInt.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");

        Scanner okuStr=new Scanner(System.in);
        System.out.print("işlem tipini giriniz:");
        String islem=okuStr.next();

        int t= sayi1+sayi2;
        int c= sayi1-sayi2;
        int p= sayi1*sayi2;
        double b=(double) sayi1/sayi2;

        if (islem.equalsIgnoreCase("T")){
            System.out.println("Toplam = " + t);
        } else if (islem.equalsIgnoreCase("Ç")) {
            System.out.println("Çıkarma = " + c);
        } else if (islem.equalsIgnoreCase("P")) {
            System.out.println("Çarpma = " +p);
        }else if (islem.equalsIgnoreCase("B")){
            System.out.println("Bölme = " +b);
        }else {
            System.out.println("Yanlış giriş yaptınız");
        }
    }
}
