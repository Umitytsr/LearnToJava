package Gun13_While_DoWhile;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar girdiği sayıların
        //toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");

        int sayi=oku.nextInt();
        int toplam=sayi;

        while (sayi!=0){
            System.out.print("Sayı giriniz:");
            sayi=oku.nextInt();
            toplam=toplam+sayi;

        } System.out.println("toplam = " + toplam);
    }
}
