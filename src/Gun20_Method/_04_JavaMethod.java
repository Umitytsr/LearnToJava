package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayı= ");
        int a= oku.nextInt();
        System.out.print("2. sayı= ");
        int b= oku.nextInt();

        int sonuc=toplamBul(a,b);
        System.out.println("sonuc = " + sonuc);
    }

    public static int toplamBul(int a,int b){
//        int toplam= a+b;
//        return toplam;

        //veya
        return (a+b);
    }
}
