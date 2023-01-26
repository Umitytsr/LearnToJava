package Gun12_Switch;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        //daha önce çözdüğünüz hesap makinesi sorusunu
        //switch ile çözünüz

        Scanner oku=new Scanner(System.in);
        System.out.print("say1=");
        int s1= oku.nextInt();

        System.out.print("sayı2=");
        int s2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");

        Scanner okuStr=new Scanner(System.in);
        System.out.print("işlem tipini giriniz:");
        String islem1=okuStr.next();

        switch (islem1.toUpperCase()){
            case "T": System.out.println("Toplam:"+(s1+s2));break;
            case "Ç": System.out.println("Çıkarma:"+(s1-s2));break;
            case "P": System.out.println("Çarpma:"+(s1*s2));break;
            case "B": System.out.println("Bölme:"+((double)s1/s2));break;
            default: System.out.println("Hatalı değer");
            //default else ile aynı anlamdadır.
        }
    }
}
