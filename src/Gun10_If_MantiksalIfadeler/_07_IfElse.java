package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        //yan yana aralarında bir boşluk girilen 2 int sayının
        //birbirine eşit olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Yan yana iki sayı giriniz:");
        String sayi= oku.nextLine();
        int uzunluk=sayi.length();
        int bosluk=sayi.indexOf(" ");
        String sayi1=sayi.substring(0,bosluk);
        String sayi2=sayi.substring(bosluk+1,uzunluk);
        //burda uzunluĞa gerek duymadan String sayi2=sayi.substring(bosluk+1)
        //şeklinde yapabilirdik.Çünkü substring de başlangıç noktasını verip
        // kapanışı vermezsek sonuna kadar alır. Yani; String sayi3=sayi.substring(bosluk+1);



        if (sayi1.equals(sayi2)){
            System.out.println("Eşit");
        }else {
            System.out.println("Eşit Değil");
        }


    }
}
